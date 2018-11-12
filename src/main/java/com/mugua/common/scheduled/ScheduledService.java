package com.mugua.common.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.mugua.core.userInfo.mapper.UserInfoMapper;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.repository.UserInfoRepository;
import com.mugua.core.vote.mapper.VoteMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * 定时任务类,用于每天定时更新数据库
 * @author 木瓜
 *
 */
@Component
@Slf4j
public class ScheduledService {
	@Autowired
    ElasticsearchTemplate elasticsearchTemplate;
	@Autowired
	UserInfoRepository userInfoRepository;
	@Autowired
	UserInfoMapper userInfoMapper;
	
	
//  每分钟启动
/*  @Scheduled(cron = "0 0/1 * * * ?")
  public void timerToNow(){
      System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
  }*/
//  每10S启动
 /* @Scheduled(cron = "0/10 * * * * ?")
  public void timerS(){
	  System.out.println("now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
  }*/
  @Scheduled(cron = "0 0 3 * * ?")//每天3点执行
  //@Scheduled(cron = "0/10 * * * * ?")
  public void timerH(){
	  log.warn("------------更新索引库--------------now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	  userInfoRepository.deleteAll();
	  List<UserInfo> list = userInfoMapper.selectAll();
		for (UserInfo userInfo : list) {
			System.out.println(userInfo);
		}
		userInfoRepository.save(list);
		  log.warn("------------更新索引库结束--------------now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));

  }
  
  @Autowired
  private VoteMapper voteMapper;
 // @Scheduled(cron = "0/50 * * * * ?")//每50s执行
  @Scheduled(cron = "0 0 0 * * ?")//每天0点执行
  public void clearZeroVote(){
	  log.warn("------------清空投票次数--------------now time:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	  voteMapper.clearZero();
  }

}
