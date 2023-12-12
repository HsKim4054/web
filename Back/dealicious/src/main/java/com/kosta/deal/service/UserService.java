package com.kosta.deal.service;

import org.springframework.web.multipart.MultipartFile;

import com.kosta.deal.entity.User;

public interface UserService {
	User login(String email, String password) throws Exception;
	boolean checkNickname(String nickname) throws Exception;
	void uploadProfileimg(User user, MultipartFile file) throws Exception;
}
