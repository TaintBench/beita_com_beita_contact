package com.mobclick.android;

public class UmengConstants {
    public static boolean ACTIVITY_DURATION_OPEN = true;
    public static final String[] APPLOG_URL_LIST = new String[]{"http://www.umeng.com/app_logs", "http://www.umeng.co/app_logs"};
    public static final String AtomKeyReplyId = "reply_id";
    public static final String AtomKey_AgeGroup = "age_group";
    public static final String AtomKey_AppKey = "appkey";
    public static final String AtomKey_AppVersion = "app_version";
    public static final String AtomKey_Content = "content";
    public static final String AtomKey_Date = "datetime";
    public static final String AtomKey_DeviceModel = "device_model";
    public static final String AtomKey_Email = "email";
    public static final String AtomKey_FeedbackID = "feedback_id";
    public static final String AtomKey_Index = "reply_id";
    public static final String AtomKey_Lat = "lat";
    public static final String AtomKey_Lng = "lng";
    public static final String AtomKey_Message = "msg";
    public static final String AtomKey_OSVersion = "os_version";
    public static final String AtomKey_SDK_Version = "sdk_version";
    public static final String AtomKey_SequenceNum = "sequence_num";
    public static final String AtomKey_Sex = "gender";
    public static final String AtomKey_State = "state";
    public static final String AtomKey_Thread_Title = "thread";
    public static final String AtomKey_Type = "type";
    public static final String AtomKey_User_ID = "user_id";
    public static final String Atom_State_Error = "error";
    public static final String Atom_State_OK = "ok";
    public static final String Atom_Type_DevReply = "dev_reply";
    public static final String Atom_Type_NewFeedback = "new_feedback";
    public static final String Atom_Type_Responce = "responce";
    public static final String Atom_Type_UserReply = "user_reply";
    public static boolean COMPRESS_DATA = true;
    public static final String CONFIG_URL = "http://www.umeng.com/check_config_update";
    public static final String CONFIG_URL_BACK = "http://www.umeng.co/check_config_update";
    public static final int DEFAULT_TIMEZONE = 8;
    public static final String FEEDBACK_BASE_URL = "http://feedback.whalecloud.com";
    public static final String FEEDBACK_ClearNewReplyState_URL = "http://feedback.whalecloud.com/mark_viewed";
    public static final String FEEDBACK_Dev_Reply_URL = "http://feedback.whalecloud.com/feedback/reply";
    public static final String FEEDBACK_HasNewReply_URL = "http://feedback.whalecloud.com/dev_replied";
    public static final String FEEDBACK_NewFeedback_URL = "http://feedback.whalecloud.com/feedback/feedbacks";
    public static final String FEEDBACK_REPLY_URL = "http://feedback.whalecloud.com/reply";
    public static final String FEEDBACK_UER_REPLY_URL = "http://feedback.whalecloud.com/feedback/reply";
    public static final String FEEDBACK_Url_RetrieveUserInfo = "http://feedback.whalecloud.com/feedback/userinfo";
    public static final String FailPreName = "fail";
    public static final String FailState = "fail";
    public static final String FeedbackPreName = "feedback";
    public static final String HasNewReplyBroadcast = "HasNewReplyBroadcast";
    public static final int HasNewReplyBroadcast_No = 0;
    public static final int HasNewReplyBroadcast_Yes = 1;
    public static String LAST_SEND_TIME = "last_send_time";
    public static boolean LOCATION_OPEN = true;
    public static final String LOG_TAG = "MobclickAgent";
    public static final String NewReplyContent = "NewReplyContent";
    public static final String NewReplyNotifyType = "NewReplyNotifyType";
    public static final int NotificationBanner = 1;
    public static final int NotificationPopout = 0;
    public static final String OKState = "ok";
    public static final String OS = "Android";
    public static final String PostFeedbackBroadcast = "PostFeedbackBroadcast";
    public static final String PostFeedbackBroadcastAction = "postFeedbackFinished";
    public static final String PostFeedbackBroadcast_Fail = "fail";
    public static final String PostFeedbackBroadcast_Succeed = "succeed";
    public static final String PreName_ReplyId = "umeng_reply_index";
    public static final String PreName_Trivial = "UmengFb_Nums";
    public static final String RetrieveReplyBroadcastAction = "RetrieveReplyBroadcast";
    public static final int RetrieveReplyBroadcast_Fail = -1;
    public static final int RetrieveReplyBroadcast_HasReply = 1;
    public static final int RetrieveReplyBroadcast_NoReply = 0;
    public static final String SDK_TYPE = "Android";
    public static final String SDK_VERSION = "3.0";
    public static final String TempPreName = "temp";
    public static final String TempState = "sending";
    public static final String TrivialPreKey_AgeGroup = "ageGroup";
    public static final String TrivialPreKey_Email = "email";
    public static final String TrivialPreKey_MaxReplyID = "maxReplyID";
    public static final String TrivialPreKey_MaxSeqenceNum = "maxSequenceNum";
    public static final String TrivialPreKey_Sex = "sex";
    public static final String TrivialPreKey_newreplyIds = "newReplyIds";
    public static final String[] UPDATE_URL_LIST = new String[]{"http://www.umeng.com/api/check_app_update", "http://www.umeng.co/api/check_app_update"};
    public static String UmengFeedbackLog = "UmengLog";
    public static boolean enableCacheInUpdate = true;
    public static final long kContinueSessionMillis = 30000;
    public static final Object saveOnlineConfigMutex = new Object();
    public static boolean testMode = false;
}
