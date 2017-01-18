package com.anhuaiyuan.yijia.global;

import java.io.File;

public class Constant {
	
	/** SharedPreferences路径 */
	public static String SHARED_PATH = "my_shared";

	// cookies
	public static final String USERID_COOKIE = "";
	public static final String USERNAME_COOKIE = "cookieName";
	public static final String PASSWORD_COOKIE = "cookiePassword";
	public static final String USERKEY_COOKIE = "cookieKey";
	public static final String PASSWORDREMEMBER_COOKIE = "cookieRemember";
	public static final String ISFIRSTSTART = "isfirstStart";
	public static final String AUTOLOGIN = "autoLogin";
	
	/** 媒体文件保存路径 */
	public static final String videoPath =  File.separator + "video" + File.separator;
	public static final String audioPath =  File.separator + "audio" + File.separator;

	// index
	public static final String DEFAULTCITYID = "1001";
	public static final String DEFAULTCITYNAME = "南京";
	
	/** 升级APP 用 android标识 */
	public static final String ANDROID_CLIENT = "yijia_android_phone_client";

	/** 服务器地址 */
//	public static String SERVER_ADDRESS = "http://121.41.44.28:8081/CenterServer/";
	public static String SERVER_ADDRESS = "http://192.168.2.42:8080/CenterServer/";
	
	/**消息服务*/
	public static final String xmppHost = "121.41.44.28";
//	public final static String xmppHost = "192.168.1.127";
	public static final int xmppPort = 5222;  
	
	/** 是否在线*/
	public static final String IS_ONLINE_URL = SERVER_ADDRESS + "isOnline.do";
		
	// ################接口配置以下#############################
	/** 获取验证码 */
	public static final String IDENTIFYCODE_URL = SERVER_ADDRESS + "identifyCode.do";

	/** 验证账户 */
	public static final String VALIDATE_URL = SERVER_ADDRESS + "validate.do";
	
	/** 注册验证 */
	public static final String REGISTER_VALIDATE_URL = SERVER_ADDRESS + "registerValidate.do";

	/** 注册 */
	public static final String REGISTER_URL = SERVER_ADDRESS + "register.do";

	/** 登录 */
	public static final String LOGIN_URL = SERVER_ADDRESS + "login.do";

	/** 修改密码 */
	public static final String MODIFY_PASSWORD_URL = SERVER_ADDRESS + "modifyPassword.do";

	/** 找回密码 */
	public static final String FIND_PASSWORD = SERVER_ADDRESS + "findPassword.do";
	
	/** 找回密码 验证*/
	public static final String FIND_PASSWORD_VALIDATE_URL = SERVER_ADDRESS + "findPasswordValidate.do";

	/** 我收藏的商品 */
	public static final String FAV_GOODS_URL = SERVER_ADDRESS + "favGoods.do";

	/** 我收藏的店铺 */
	public static final String FAV_SHOPS_URL =  SERVER_ADDRESS + "favShops.do";

	/** 升级 */
	public static final String UPDATE_URL =  SERVER_ADDRESS + "appUpdate.do";

	/** 修改个人信息 */
	public static final String MODIFY_USER_URL =  SERVER_ADDRESS + "modifyUser.do";

	/** 上传文件 fastdfs ftp */
	public static final String FILE_UPLOAD_URL =  SERVER_ADDRESS + "upload.do?type=ftp";

	/** 城市列表 */
	public static final String CITY_LIST_URL =  SERVER_ADDRESS + "cityList.do";
	
	/** 地区列表 */
	public static String REGION_LIST_URL = SERVER_ADDRESS + "regionList.do";
	
	/** 省份列表 */
	public static String PROVINCE_LIST_URL = SERVER_ADDRESS +"provinceList.do";
	
	/** 商品列表 */
	public static String GOODS_LIST_URL =  SERVER_ADDRESS + "goodsList.do";

	/** 商家列表 */
	public static String SHOP_LIST_URL =  SERVER_ADDRESS + "shopList.do";

	/** 店铺商品数量查询 */
	public static String SHOP_GOODS_COUNT_URL =  SERVER_ADDRESS + "shopGoodsCount.do";
	
	/**店铺订单数量*/
	public static final String SHOP_ORDER_COUNT_URL =  SERVER_ADDRESS + "shopOrderCount.do";
	
	/**我的店铺信息*/
	public static final String SHOP_INFO_URL =  SERVER_ADDRESS + "shopInfo.do";
	
	/**banner列表*/
	public static final String BANNER_LIST_URL = SERVER_ADDRESS + "bannerList.do";
	
	/** Ad列表 */
	public static final String AD_LIST_URL =  SERVER_ADDRESS + "adList.do";
	
	/**获取店铺图片*/
	public static final String SHOP_PICTURE_LIST_URL = SERVER_ADDRESS+ "shopPictureList.do";
	
	/**添加店铺图片*/
	public static final String ADD_SHOP_PICTURES_URL = SERVER_ADDRESS + "addShopPictures.do";
	
	/**删除店铺图片*/
	public static final String DELETE_SHOP_PICTURES_URL = SERVER_ADDRESS + "deleteShopPicture.do";
	
	/**根据名字获取城市信息*/
	public static final String CITY_DETAIL_URL = SERVER_ADDRESS + "cityDetail.do";
	
	/**根据地区ID获得商圈列表*/
	public static final String BUSINESS_AREA_LIST_URL = SERVER_ADDRESS + "businessAreaList.do";
	
	/**根据地区组获得商圈列表*/
	public static final String BUSINESS_AREA_LISTS_URL = SERVER_ADDRESS + "businessAreaLists.do";
	
	/**查询分类列表*/
	public static String CATEGORY_LIST_URL = SERVER_ADDRESS + "categoryList.do";
	
	/**查询商品详情*/
	public static String GOODS_DETAIL_URL = SERVER_ADDRESS + "goodsDetail.do";
		
	/**查询店铺详情*/
	public static String SHOP_DETAIL_URL = SERVER_ADDRESS + "shopDetail.do";
	
	/**增加收藏*/
	public static String ADD_FAV_GOODS_URL = SERVER_ADDRESS + "addFavGoods.do";
	
	/**删除收藏*/
	public static String DEL_FAV_GOODS_URL = SERVER_ADDRESS + "delFavGoods.do";
	
	/**增加收藏*/
	public static String ADD_FAV_SHOP_URL = SERVER_ADDRESS + "addFavShop.do";
	
	/**删除收藏*/
	public static String DEL_FAV_SHOP_URL = SERVER_ADDRESS + "delFavShop.do";
	
	/**卖家信息*/
	public static String SELLER_INFO_URL = SERVER_ADDRESS + "sellerInfo.do";
	
	/**提交订单*/
	public static String ADD_ORDER_URL = SERVER_ADDRESS + "addOrder.do";

	/**消息列表*/
	public static String MESSAGE_LIST_URL = SERVER_ADDRESS + "messageList.do";
	
	/**消息列表*/
	public static String CHAT_MESSAGE_DETAIL = SERVER_ADDRESS + "chatMessageDetail.do";
	
	/**消息列表*/
	public static String SEND_MESSAGE = SERVER_ADDRESS + "sendMessage.do";
	
	/**保存消息到服务器*/
	public static String MESSAGE_SAVE = SERVER_ADDRESS + "addMessage.do";
	
	/**订单列表*/
	public static String ORDER_LIST_URL = SERVER_ADDRESS + "orderList.do";
	
	/**订单详情*/
	public static String ORDER_DEATAIL_URL = SERVER_ADDRESS + "orderDetail.do";
	
	/**修改卖家信息*/
	public static String MODIFY_SELLER_URL = SERVER_ADDRESS + "modifySeller.do";
	
	/**修改店铺信息*/
	public static String MODIFY_SHOP_URL = SERVER_ADDRESS + "modifyShop.do";
	
	/**店铺服务*/
	public static String MODIFY_SHOP_SERVICE_URL = SERVER_ADDRESS + "modifyShopService.do";
	
	/**店铺服务列表*/
	public static String SERVICE_ITEM_LIST_URL = SERVER_ADDRESS + "serviceItemList.do";
	
	/** 修改商品 modifyGoods */
	public final static String MODIFY_GOODS_URL = SERVER_ADDRESS + "modifyGoods.do";
	
	/** 删除商品 deleteGoods */
	public final static String DELETE_GOODS_URL = SERVER_ADDRESS + "deleteGoods.do";
	
	/** 修改商品状态 modifyGoodsStatus */
	public final static String MODIFY_GOODS_STATUS_URL = SERVER_ADDRESS + "modifyGoodsStatus.do";
	
	/** 添加商品 */
	public final static String ADD_GOODS_URL = SERVER_ADDRESS + "addGoods.do";
	
	/**获取用户信息 */
	public final static String GET_USERINFO = SERVER_ADDRESS + "getUser.do";
	
	/** 注销用户 */
	public static final String QUIT_USER_URL =  SERVER_ADDRESS + "quit.do";
	
	
	/** 注销用户 */
	public static final String ORDER_MODIFY=  SERVER_ADDRESS + "modifyOrder.do";
	
	
		
	/* ################接口配置以上############################# */
	
	/**
	 * URL 补完纠错
	 * @return
	 */
	public static String urlFillFEC(String url){
		if(url==null){
			return null;
		}
		String urlOk = null;
		if(url.toLowerCase().indexOf("http://")!=-1 ||url.toLowerCase().indexOf("https://")!=-1){
			urlOk = url;
		}else if(url.toLowerCase().startsWith("www.")){
			urlOk = url;
		}else if(url.toLowerCase().startsWith("/uploads")){
			urlOk = SERVER_ADDRESS + url.substring(1);
		}else if(url.toLowerCase().startsWith("uploads")){
			urlOk = SERVER_ADDRESS + url;
		}
		return urlOk;
	}
	
	  

}
