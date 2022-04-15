package com.kafka_test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kafka_test.dto.MemberDto;

@Mapper
public interface MemberDao {
	List<MemberDto> getMemberList();
}
