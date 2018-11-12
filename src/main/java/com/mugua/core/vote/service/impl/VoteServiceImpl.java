package com.mugua.core.vote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mugua.core.vote.mapper.VoteMapper;
import com.mugua.core.vote.service.VoteService;
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteMapper voteMapper;
	
}
