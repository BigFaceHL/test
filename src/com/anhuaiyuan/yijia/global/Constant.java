package com.anhuaiyuan.yijia.global;

import java.io.File;

public class Constant {
	
	/** SharedPreferences·�� */
	public static String SHARED_PATH = "my_shared";

	// cookies
	public static final String USERID_COOKIE = "";
	public static final String USERNAME_COOKIE = "cookieName";
	public static final String PASSWORD_COOKIE = "cookiePassword";
	public static final String USERKEY_COOKIE = "cookieKey";
	public static final String PASSWORDREMEMBER_COOKIE = "cookieRemember";
	public static final String ISFIRSTSTART = "isfirstStart";
	public static final String AUTOLOGIN = "autoLogin";
	
	/** ý���ļ�����·�� */
	public static final String videoPath =  File.separator + "video" + File.separator;
	public static final String audioPath =  File.separator + "audio" + File.separator;

	// index
	public static final String DEFAULTCITYID = "1001";
	public static final String DEFAULTCITYNAME = "�Ͼ�";
	
	/** ����APP �� android��ʶ */
	public static final String ANDROID_CLIENT = "yijia_android_phone_client";

	/** ��������ַ */
//	public static String SERVER_ADDRESS = "http://121.41.44.28:8081/CenterServer/";
	public static String SERVER_ADDRESS = "http://192.168.2.42:8080/CenterServer/";
	
	/**��Ϣ����*/
	public static final String xmppHost = "121.41.44.28";
//	public final static String xmppHost = "192.168.1.127";
	public static final int xmppPort = 5222;  
	
	/** �Ƿ�����*/
	public static final String IS_ONLINE_URL = SERVER_ADDRESS + "isOnline.do";
		
	// ################�ӿ���������#############################
	/** ��ȡ��֤�� */
	public static final String IDENTIFYCODE_URL = SERVER_ADDRESS + "identifyCode.do";

	/** ��֤�˻� */
	public static final String VALIDATE_URL = SERVER_ADDRESS + "validate.do";
	
	/** ע����֤ */
	public static final String REGISTER_VALIDATE_URL = SERVER_ADDRESS + "registerValidate.do";

	/** ע�� */
	public static final String REGISTER_URL = SERVER_ADDRESS + "register.do";

	/** ��¼ */
	public static final String LOGIN_URL = SERVER_ADDRESS + "login.do";

	/** �޸����� */
	public static final String MODIFY_PASSWORD_URL = SERVER_ADDRESS + "modifyPassword.do";

	/** �һ����� */
	public static final String FIND_PASSWORD = SERVER_ADDRESS + "findPassword.do";
	
	/** �һ����� ��֤*/
	public static final String FIND_PASSWORD_VALIDATE_URL = SERVER_ADDRESS + "findPasswordValidate.do";

	/** ���ղص���Ʒ */
	public static final String FAV_GOODS_URL = SERVER_ADDRESS + "favGoods.do";

	/** ���ղصĵ��� */
	public static final String FAV_SHOPS_URL =  SERVER_ADDRESS + "favShops.do";

	/** ���� */
	public static final String UPDATE_URL =  SERVER_ADDRESS + "appUpdate.do";

	/** �޸ĸ�����Ϣ */
	public static final String MODIFY_USER_URL =  SERVER_ADDRESS + "modifyUser.do";

	/** �ϴ��ļ� fastdfs ftp */
	public static final String FILE_UPLOAD_URL =  SERVER_ADDRESS + "upload.do?type=ftp";

	/** �����б� */
	public static final String CITY_LIST_URL =  SERVER_ADDRESS + "cityList.do";
	
	/** �����б� */
	public static String REGION_LIST_URL = SERVER_ADDRESS + "regionList.do";
	
	/** ʡ���б� */
	public static String PROVINCE_LIST_URL = SERVER_ADDRESS +"provinceList.do";
	
	/** ��Ʒ�б� */
	public static String GOODS_LIST_URL =  SERVER_ADDRESS + "goodsList.do";

	/** �̼��б� */
	public static String SHOP_LIST_URL =  SERVER_ADDRESS + "shopList.do";

	/** ������Ʒ������ѯ */
	public static String SHOP_GOODS_COUNT_URL =  SERVER_ADDRESS + "shopGoodsCount.do";
	
	/**���̶�������*/
	public static final String SHOP_ORDER_COUNT_URL =  SERVER_ADDRESS + "shopOrderCount.do";
	
	/**�ҵĵ�����Ϣ*/
	public static final String SHOP_INFO_URL =  SERVER_ADDRESS + "shopInfo.do";
	
	/**banner�б�*/
	public static final String BANNER_LIST_URL = SERVER_ADDRESS + "bannerList.do";
	
	/** Ad�б� */
	public static final String AD_LIST_URL =  SERVER_ADDRESS + "adList.do";
	
	/**��ȡ����ͼƬ*/
	public static final String SHOP_PICTURE_LIST_URL = SERVER_ADDRESS+ "shopPictureList.do";
	
	/**��ӵ���ͼƬ*/
	public static final String ADD_SHOP_PICTURES_URL = SERVER_ADDRESS + "addShopPictures.do";
	
	/**ɾ������ͼƬ*/
	public static final String DELETE_SHOP_PICTURES_URL = SERVER_ADDRESS + "deleteShopPicture.do";
	
	/**�������ֻ�ȡ������Ϣ*/
	public static final String CITY_DETAIL_URL = SERVER_ADDRESS + "cityDetail.do";
	
	/**���ݵ���ID�����Ȧ�б�*/
	public static final String BUSINESS_AREA_LIST_URL = SERVER_ADDRESS + "businessAreaList.do";
	
	/**���ݵ���������Ȧ�б�*/
	public static final String BUSINESS_AREA_LISTS_URL = SERVER_ADDRESS + "businessAreaLists.do";
	
	/**��ѯ�����б�*/
	public static String CATEGORY_LIST_URL = SERVER_ADDRESS + "categoryList.do";
	
	/**��ѯ��Ʒ����*/
	public static String GOODS_DETAIL_URL = SERVER_ADDRESS + "goodsDetail.do";
		
	/**��ѯ��������*/
	public static String SHOP_DETAIL_URL = SERVER_ADDRESS + "shopDetail.do";
	
	/**�����ղ�*/
	public static String ADD_FAV_GOODS_URL = SERVER_ADDRESS + "addFavGoods.do";
	
	/**ɾ���ղ�*/
	public static String DEL_FAV_GOODS_URL = SERVER_ADDRESS + "delFavGoods.do";
	
	/**�����ղ�*/
	public static String ADD_FAV_SHOP_URL = SERVER_ADDRESS + "addFavShop.do";
	
	/**ɾ���ղ�*/
	public static String DEL_FAV_SHOP_URL = SERVER_ADDRESS + "delFavShop.do";
	
	/**������Ϣ*/
	public static String SELLER_INFO_URL = SERVER_ADDRESS + "sellerInfo.do";
	
	/**�ύ����*/
	public static String ADD_ORDER_URL = SERVER_ADDRESS + "addOrder.do";

	/**��Ϣ�б�*/
	public static String MESSAGE_LIST_URL = SERVER_ADDRESS + "messageList.do";
	
	/**��Ϣ�б�*/
	public static String CHAT_MESSAGE_DETAIL = SERVER_ADDRESS + "chatMessageDetail.do";
	
	/**��Ϣ�б�*/
	public static String SEND_MESSAGE = SERVER_ADDRESS + "sendMessage.do";
	
	/**������Ϣ��������*/
	public static String MESSAGE_SAVE = SERVER_ADDRESS + "addMessage.do";
	
	/**�����б�*/
	public static String ORDER_LIST_URL = SERVER_ADDRESS + "orderList.do";
	
	/**��������*/
	public static String ORDER_DEATAIL_URL = SERVER_ADDRESS + "orderDetail.do";
	
	/**�޸�������Ϣ*/
	public static String MODIFY_SELLER_URL = SERVER_ADDRESS + "modifySeller.do";
	
	/**�޸ĵ�����Ϣ*/
	public static String MODIFY_SHOP_URL = SERVER_ADDRESS + "modifyShop.do";
	
	/**���̷���*/
	public static String MODIFY_SHOP_SERVICE_URL = SERVER_ADDRESS + "modifyShopService.do";
	
	/**���̷����б�*/
	public static String SERVICE_ITEM_LIST_URL = SERVER_ADDRESS + "serviceItemList.do";
	
	/** �޸���Ʒ modifyGoods */
	public final static String MODIFY_GOODS_URL = SERVER_ADDRESS + "modifyGoods.do";
	
	/** ɾ����Ʒ deleteGoods */
	public final static String DELETE_GOODS_URL = SERVER_ADDRESS + "deleteGoods.do";
	
	/** �޸���Ʒ״̬ modifyGoodsStatus */
	public final static String MODIFY_GOODS_STATUS_URL = SERVER_ADDRESS + "modifyGoodsStatus.do";
	
	/** �����Ʒ */
	public final static String ADD_GOODS_URL = SERVER_ADDRESS + "addGoods.do";
	
	/**��ȡ�û���Ϣ */
	public final static String GET_USERINFO = SERVER_ADDRESS + "getUser.do";
	
	/** ע���û� */
	public static final String QUIT_USER_URL =  SERVER_ADDRESS + "quit.do";
	
	
	/** ע���û� */
	public static final String ORDER_MODIFY=  SERVER_ADDRESS + "modifyOrder.do";
	
	
		
	/* ################�ӿ���������############################# */
	
	/**
	 * URL �������
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
