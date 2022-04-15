package com.kafka_test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafka_test.dao.MemberDao;
import com.kafka_test.dto.MemberDto;

@Service
public class MemberService {
	
	@Autowired
    private MemberDao memberDao;
	
	public List<MemberDto> getMemberList(){
		return memberDao.getMemberList();
	}
	
}
