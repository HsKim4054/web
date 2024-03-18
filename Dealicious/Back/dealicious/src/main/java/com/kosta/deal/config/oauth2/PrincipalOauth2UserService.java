package com.kosta.deal.config.oauth2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.kosta.deal.config.auth.PrincipalDetails;
import com.kosta.deal.entity.User;
import com.kosta.deal.repository.UserRepository;

@Service
public class PrincipalOauth2UserService extends DefaultOAuth2UserService {
	
	public static boolean aa = true;
	
	public static boolean getAa() {
        return aa;
    }
	
	public static void setAa(boolean aa) {
		PrincipalOauth2UserService.aa = aa;
	}

	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	//userRequest는 code를 받아서 accessToken을 응답받은 객체
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) throws OAuth2AuthenticationException {
//		System.out.println("accessToken:"+ userRequest.getAccessToken().getTokenValue());
//		System.out.println("clientRegistration:"+userRequest.getClientRegistration());
//		System.out.println("oAuth2User:"+super.loadUser(userRequest));
		OAuth2User oAuth2User = super.loadUser(userRequest);
		return pricessOAuth2User(userRequest, oAuth2User);
	}
	
	private OAuth2User pricessOAuth2User(OAuth2UserRequest userRequest,OAuth2User oAuth2User) {
		OAuth2UserInfo oAuth2UserInfo = null;
		if(userRequest.getClientRegistration().getRegistrationId().equals("naver")) {
			oAuth2UserInfo = new NaverUserInfo(oAuth2User.getAttribute("response"));
		} else if(userRequest.getClientRegistration().getRegistrationId().equals("kakao")) {
			oAuth2UserInfo = new KakaoUserInfo(oAuth2User.getAttributes());
		}
		Optional<User> userOptional = 
				userRepository.findByProviderAndProviderId(oAuth2UserInfo.getProvider(), oAuth2UserInfo.getProviderId());
		User user = null;
		if(userOptional.isPresent()) { //이미 가입되어 있으면 update
			user = userOptional.get();
			//user.setEmail(oAuth2UserInfo.getEmail());
			aa=false;
		} else {  //가입되어있지 않으면 insert
			user = User.builder().username(oAuth2UserInfo.getProvider()+"_"+oAuth2UserInfo.getProviderId())
				.socialemail(oAuth2UserInfo.getEmail())
				.roles("ROLE_USER")
				.provider(oAuth2UserInfo.getProvider())
				.providerId(oAuth2UserInfo.getProviderId())
//				.password(bCryptPasswordEncoder.encode(oauthPassword))
				.build();
			userRepository.save(user);
		}
		
		return new PrincipalDetails(user, oAuth2User.getAttributes());
	}
}
