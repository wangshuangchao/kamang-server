package com.mugua;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestOperations;

import com.github.pagehelper.PageHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mugua.common.pojo.ResultInfo;
import com.mugua.common.util.IdWorker;
import com.mugua.core.activity.mapper.ActivityMapper;
import com.mugua.core.activity.pojo.Activity;
import com.mugua.core.apply.mapper.ApplyMapper;
import com.mugua.core.apply.pojo.Apply;
import com.mugua.core.apply.service.ApplyService;
import com.mugua.core.ask.mapper.AskMapper;
import com.mugua.core.ask.pojo.Ask;
import com.mugua.core.brokenlist.mapper.BrokenlistInfoMapper;
import com.mugua.core.brokenlist.pojo.BrokenlistInfo;
import com.mugua.core.brokenlist.pojo.BrokenlistInfoExample;
import com.mugua.core.brokenlist.repository.BrokenlistRepository;
import com.mugua.core.dynamic.mapper.DynamicInfoMapper;
import com.mugua.core.dynamic.pojo.DynamicInfo;
import com.mugua.core.dynamic.pojo.DynamicInfoExample;
import com.mugua.core.feedback.mapper.FeedbackMapper;
import com.mugua.core.feedback.pojo.Feedback;
import com.mugua.core.goods.mapper.GoodsMapper;
import com.mugua.core.goods.pojo.Goods;
import com.mugua.core.index.pojo.DynamicVo;
import com.mugua.core.mgshop.vo.MgGoodsVo;
import com.mugua.core.pay.mgaddress.mapper.MgAddressMapper;
import com.mugua.core.pay.mgaddress.pojo.MgAddress;
import com.mugua.core.pay.mggoods.mapper.MgGoodsMapper;
import com.mugua.core.pay.mggoods.pojo.GoodsVo;
import com.mugua.core.pay.mggoods.pojo.MgGoods;
import com.mugua.core.pay.mggoods.pojo.MgGoodsExample;
import com.mugua.core.pay.mggoods.service.MggoodsService;
import com.mugua.core.pay.order.mapper.OrderMapper;
import com.mugua.core.pay.order.pojo.Order;
import com.mugua.core.pay.order.pojo.OrderExample;
import com.mugua.core.sayone.mapper.SayOneInfoMapper;
import com.mugua.core.sayone.pojo.SayOneInfo;
import com.mugua.core.sayone.pojo.SayOneInfoExample;
import com.mugua.core.update.mapper.UpdateInfoMapper;
import com.mugua.core.update.pojo.UpdateInfo;
import com.mugua.core.userInfo.mapper.UserInfoMapper;
import com.mugua.core.userInfo.pojo.UserInfo;
import com.mugua.core.userInfo.pojo.UserInfoExample;
import com.mugua.core.userInfo.repository.UserInfoRepository;
import com.mugua.qichacha.mapper.CompanyMapper;
import com.mugua.qichacha.pojo.Company;
import com.mugua.qichacha.pojo.CompanyVo;
import com.mugua.qichacha.pojo.SearchVo;
import com.mugua.qichacha.repository.CompanyRepository;
import com.mugua.qichacha.service.QICCService;




@RunWith(SpringRunner.class)
@SpringBootTest
public class CmCoreApplicationTests {
	@Autowired
    ElasticsearchTemplate elasticsearchTemplate;
	@Autowired
	UserInfoRepository userInfoRepository;
	@Autowired
	UserInfoMapper userInfoMapper;
	@Autowired
	private QICCService qiCCServiceImpl;
	@Autowired
	private CompanyMapper companyMapper;
	@Autowired
	private CompanyRepository companyRespository;
	@Autowired
	private SayOneInfoMapper sayOneMapper;
	@Autowired
	private DynamicInfoMapper dynamicMapper;
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private BrokenlistInfoMapper brokenMapper;
	@Autowired
	private BrokenlistRepository brokenRepository;
	
	@Test
	public void addUser() throws ParseException{
		/*  
         * 第一个参数是第几页；第二个参数是每页显示条数。  
         */
		//PageHelper.startPage(2,5);
		
		List<UserInfo> list = userInfoMapper.selectAll();
//		UserInfoExample example=new UserInfoExample();
//		List<UserInfo> list =userInfoMapper.selectByExample(example);
		/*for (UserInfo userInfo : list) {
			//System.out.println(string+"测试");
			System.out.println(userInfo);
		}*/
		userInfoRepository.save(list);
		System.out.println("-----------华丽分割线-----------");
	/*	String queryString="俊";//搜索关键字
        QueryStringQueryBuilder builder=new QueryStringQueryBuilder(queryString);

        Iterable<UserInfo> searchResult = userInfoRepository.search(builder);
        Iterator<UserInfo> iterator = searchResult.iterator();
        while(iterator.hasNext()){
        	UserInfo userinfo = iterator.next();
        	userInfoRepository.delete(userinfo);
        	userinfo.setUserName("蛋蛋");
        	userInfoMapper.updateByPrimaryKeySelective(userinfo);
        	userInfoRepository.save(userinfo);
            System.out.println(userinfo);
        }*/
        System.out.println("-----------华丽分割线-----------");
	}
	@Test
	public void test(){
        Pageable pageable = new PageRequest(0, 10);
        QueryStringQueryBuilder queryString = new QueryStringQueryBuilder("马骏");
        SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(queryString).withPageable(pageable).build();
        List<UserInfo> list = elasticsearchTemplate.queryForList(searchQuery, UserInfo.class);
        for (UserInfo userInfo : list) {
        	System.out.println("------");
        	System.out.println(userInfo);
		}
	}
	
	@Test
	public void contextLoads() {
//		CompanyVo searchWide = qiCCServiceImpl.searchWides("河北木瓜","1");
//		System.out.println(searchWide);
	}
	@Test
	public void addCompany() {
		SayOneInfoExample example=new SayOneInfoExample();
		SayOneInfo sayOneInfo = sayOneMapper.selectByPrimaryKey("123");
		//List<SayOneInfo> list = sayOneMapper.selectByExample(example);
		System.out.println(sayOneInfo);
		//List<SayOneInfo> list = sayOneMapper.selectPaging();
		//System.out.println(list);
	}
	@Test
	public void testVo() {
		PageHelper.startPage(1,4);
		DynamicInfoExample dynamicInfoExamplE=new DynamicInfoExample();
		List<DynamicInfo> dynamics =dynamicMapper.selectByExample(dynamicInfoExamplE);
		List<DynamicVo> dynamicVo=new ArrayList<DynamicVo>();
		for (DynamicInfo dynamicInfo : dynamics) {
			DynamicVo dy=new DynamicVo();
			//将获取的内容封装成vo
			BeanUtils.copyProperties(dynamicInfo, dy);
			dynamicVo.add(dy);
		}
		System.out.println(dynamicVo);
	}
	@Test
	public void goodsTest(){
		Goods selectById = goodsMapper.selectById("002");
		System.out.println(selectById);
	}
	@Test
	public void brokenlistTest(){
		BrokenlistInfoExample example=new BrokenlistInfoExample();
		PageHelper.startPage(1,9);
		List<BrokenlistInfo> list = brokenMapper.selectByExample(example);
		brokenRepository.save(list);
		System.out.println("-----------华丽分割线-----------");
		String queryString="有限";//搜索关键字
        QueryStringQueryBuilder builder=new QueryStringQueryBuilder(queryString);

        Iterable<BrokenlistInfo> searchResult = brokenRepository.search(builder);
        Iterator<BrokenlistInfo> iterator = searchResult.iterator();
        while(iterator.hasNext()){
        	BrokenlistInfo broken=iterator.next();
        	System.out.println(broken);
        }
	}

	@Test
	public void companyTest(){
		 List<Company> list = companyMapper.selectAll();
		 companyRespository.save(list);
		 //companyRespository.delete(list);
		/*Company selectById = companyMapper.selectById("040X1AI3");
		System.out.println(selectById);*/
		/*List<SearchVo> list = qiCCServiceImpl.searchEnterprise("内蒙古", 1);
		System.out.println(list.get(0));*/
		/*Pageable pageable = new PageRequest(0, 10);
		QueryStringQueryBuilder queryString = new QueryStringQueryBuilder("贵州");
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(queryString).withPageable(pageable).build();
        List<Company> list = elasticsearchTemplate.queryForList(searchQuery, Company.class);
        for (Company company : list) {
        	System.out.println(company);
			
		}*/
	}
	@Autowired
	private AskMapper askMapper;
	@Test
	public void askTest(){
		
	/*	Ask ask=new Ask();
		ask.setCustomerPhone("132456");
		ask.setCustomerName("xb");
		ask.setUserId("123");
		int insertAsk = askMapper.insertAsk(ask);*/
		Ask ask = askMapper.selectById("123");
		System.out.println(ask);
	}
	@Test
	public void userTtest(){
		UserInfo user=new UserInfo();
		user.setId("11111");
		user.setIntroduceCompany("我来说绝对发垃圾我就佛啊接的佛 奥及饿哦房间");
		int i = userInfoMapper.updateByPrimaryKeySelective(user);
		
	
		System.out.println(i);
	}
	@Test
	public void esTest(){
		//QueryBuilder qb = QueryBuilders.termQuery("company", "河北木瓜网络科技有限公司"); 
		//QueryBuilder qb = QueryBuilders.fuzzyQuery("company", "木瓜");
		//QueryBuilder qb = QueryBuilders.termQuery("company", "木瓜");
		//QueryBuilder qb = QueryBuilders.wildcardQuery("company", "*河北木瓜*");
		QueryBuilder qb = QueryBuilders.matchQuery("company", "木瓜");
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(qb).build();
		List<UserInfo> list = elasticsearchTemplate.queryForList(searchQuery, UserInfo.class);
		System.out.println(list.size());
	}
	@Test
	public void esTest1(){
		 List<Company> list = companyMapper.selectByName("石家庄");
        System.out.println(list.size());
	}
	@Autowired
	private FeedbackMapper feedbackMapper;
	@Test
	public void feedbackTest(){
		Feedback feedback=new Feedback();
		feedback.setContent("skdfpojawoejh");
		feedback.setTitle("测试");
		feedback.setUserid("123456");
		feedback.setUserphone("120");
		int i=feedbackMapper.insertFeedback(feedback);
		System.out.println(i);
	}
	
	@Autowired
	private UpdateInfoMapper updateMapper;
	@Test
	public void delete(){
		UpdateInfo updateInfo = updateMapper.getUpdateInfo();
		System.out.println(updateInfo);
	}
	
	@Autowired
	private ApplyService applyServiceImpl;
	@Test
	public void applyTest(){
		Apply apply =new Apply();
		apply.setNum(20);
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		apply.setUtime(sdf.format(date));
		apply.setStory("sjdfosjwojfojafhaiuehfasndkfnabskdfbhiauebhfiadkfnakdnkfahndfilahweifhasdhnfksanfiuahebfihailsdfnkandfkabdfiabifhainbdfkasjbdfabianhflihgiohjigfhaisdfvnhi8sy7894ytrhigfnskbdfusaiegrtfh");
		ResultInfo<String> add = applyServiceImpl.add(apply);
		//List<Apply> add = applyServiceImpl.getAll();
		System.out.println(add);
	}
	
	@Autowired
	private RestOperations restOperations;
	@Test
	public void senM(){
		String url = "http://api.ikamang.com/app/sendMessage?phone={phone}&type={type}";

	    Map<String, Object> uriVariables = new HashMap<String, Object>();
	    uriVariables.put("phone", "14730311314");
	    uriVariables.put("type", "2");
	    ResultInfo<String> result = restOperations.getForObject(url, ResultInfo.class, uriVariables);
	    System.out.println("测试"+result);
	}
	
	@Autowired
	private ActivityMapper acMapper;
	@Test
	public void activityTest(){
		List<Activity> all = acMapper.getAll();
		System.out.println(all.get(0));
	}
	@Autowired
	private ApplyMapper aMapper;
	@Test
	public void uidTest(){
		Apply apply = aMapper.selectByUid("123312");
		System.err.println(apply);
	}
	
	@Autowired
	private MgGoodsMapper mgMapper;
	@Test
	public void mggoodsTest(){
	/*	MgGoodsExample example=new MgGoodsExample();
		List<MgGoods> result = mgMapper.selectByExample(example);
		List<MgGoods> list = mgMapper.selectByCommend();
		//List<MgGoods> list=mgMapper.getByUid("30af000822344b9688e43914f602868c");
		for (MgGoods mgGoods : result) {
			System.out.println(mgGoods);
		}*/
		//System.out.println(list);
		/*Integer limitById = mgMapper.getLimitById("1906199217831937");
		System.out.println(limitById);*/
		int i = mgMapper.trunCertification( 1,"1906199217831937");
		System.out.println(i+"------------");
	}
	
	@Autowired
	private MggoodsService mggoodsService;
	@Test
	public void mggoodsGetTest(){
		/*ResultInfo<MgGoodsVo> index = mggoodsService.getIndex(0);
		MgGoodsVo data = index.getData();
		System.out.println(data);*/
		/*MgGoods goo=new MgGoods();
		goo.setName("大肥猪");
		ResultInfo<String> addGoods = mggoodsService.addGoods(goo);
		System.out.println(addGoods);*/
		ResultInfo<GoodsVo> uid = mggoodsService.getByUid("111");
           GoodsVo data = uid.getData();			
           System.out.println(data);
	}
	
	@Autowired
	private MgAddressMapper addMapper;
	@Test
	public void addressTest(){
		
		MgAddress mg=new MgAddress();
		mg.setUid("123654");
		int i = addMapper.add(mg);
		System.out.println(i);
		//System.out.println(list.get(0));
	}
	
	@Autowired
	private IdWorker idWorker;
	@Test
	public void idTest(){
		System.out.println(System.currentTimeMillis());
		long id=idWorker.nextId();
		System.out.println("idWorker"+id);
		
	}
	@Autowired
	private OrderMapper oMapper;
	@Test
	public void objTest(){
		/*List<Order> list = oMapper.selectByUserId("30af000822344b9688e43914f602868c");
		for (Order order : list) {
			System.out.println(order);
			
		}*/
		/*String i="2018040321001004630272912551";
		Long y=Long.parseLong(i);*/
		//int oo=oMapper.upadateOrder(y);
//		int i=oMapper.upadateOrder(1536008403288064l);
//		System.out.println(i+"更新数据");
		int y=oMapper.delOrder(1522019187294208l);
		//int y = oMapper.deleteOrder();
		System.out.println(y+"删除无用订单");
	}
}
