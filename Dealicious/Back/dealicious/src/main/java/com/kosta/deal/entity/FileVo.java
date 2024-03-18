package com.kosta.deal.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="FILE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class FileVo {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer num;
	
	@Column
	private String directory;
	@Column
	private String name;
	@Column
	private Long size;
	@Column
	private String contenttype;
	@Column
	private Date uploaddate;
	@Column
	@Lob
	private byte[] data;
	
}
