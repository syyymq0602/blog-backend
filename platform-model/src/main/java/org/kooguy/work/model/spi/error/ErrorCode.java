package org.kooguy.work.model.spi.error;
/**
 * The enum Error code.
 *
 * @author SaberScarlet
 */
public enum ErrorCode {

    /***********
     * GENERIC *
     ***********/
    /**
     * Used to indicate a custom application error
     */
    Error(1, "通用应用程序错误。", "Generic application error."),

    IncompleteData(2, "并非所有必需数据都已提供。", "Not all required data was provided."),

    /**
     * The Business error.
     */
    BusinessError(400, "业务错误。", "Business error."),

    /**********
     * COMMON *
     **********/

    /**
     * Operation was not permitted
     */
    OperationNotPermitted(5, "用户无权执行此操作。", "User does not have permission for this operation."),

    /**
     * Bad username
     */
    InvalidMetadataFieldName(10, "元数据字段名称包含无效字符。", "Metadata field name contains invalid characters."),

    /****************
     * MICROSERVICE *
     ***************/

    /**
     * Unknown microservice identifier
     */
    InvalidMicroserviceIdentifier(500, "未识别微服务标识符。", "Microservice identifier was not recognized."),

    /*******
     *
     *******/

    /**
     * 未授权
     */
    BadRequest(400, "错误请求。", "BadRequest ."),

    /**
     * 未授权
     */
    NotFound(404, "未找到。", "NotFound ."),

    /**
     * 未授权
     */
    Unauthorized(401, "未授权。", "Unauthorized ."),

    /**
     * 被禁止
     */
    Forbidden(403, "被禁止。", "Forbidden ."),

    /**
     * 内部服务错误
     */
    InternalServerError(500, "内部服务错误。", "Internal Server Error ."),

    /**
     * 请求超时
     */
    RequestTimeout(606, "请求超时。", "Timeout ."),

    /*********
     * USERS *
     *********/

    /**
     * Bad username
     */
    InvalidUsername(1000, "用户名不存在。", "Username does not exist."),

    /**
     * Bad password
     */
    InvalidPassword(1010, "密码不匹配。", "Password did not match."),

    /**
     * Username already used
     */
    DuplicateUser(1020, "用户工号已在使用中", "User BadgeId already in use."),
    /**
     * Username already used
     */
    DuplicateUserName(1021, "用户名已在使用中", "User name already in use."),
    /**
     * Badge id not number
     */
    BadgeIdNotNumber(1022,"用户工号存在非数字字符","Badge id is not number"),

    /**
     * One or more required user fields are missing
     */
    MissingUserRequiredField(1030, "缺少用户的必填字段。", "Missing required fields for user."),

    /**
     * Invalid authority reference
     */
    InvalidAuthority(1040, "权限不存在", "Authority does not exist"),

    /**
     * Authority name already used
     */
    DuplicateAuthority(1050, "权限名称已在使用中。", "Authority name already in use."),

    /**
     * No user logged in for action that requires authorization
     */
    NotLoggedIn(1060, "您必须提供凭据才能执行此操作。", "You must provide credentials to perform this action."),

    /**
     * Invalid tenant authentication token
     */
    InvalidTenantAuthToken(1070, "未找到用于身份验证标识的租户。", "Tenant not found for authentication token."),

    /**
     * Tenant authentication token not passed
     */
    MissingTenantAuthToken(1080, "请求所需的租户身份验证标识。", "Tenant authentication token required for request."),

    /**
     * Tenant authentication token passed but tenant not authorized for user
     */
    NotAuthorizedForTenant(1090, "无权查看租户信息。", "Not authorized to view information for tenant."),

    /**
     * Invalid tenant engine reference
     */
    InvalidTenantEngineId(1100, "租户引擎不存在。", "Tenant engine does not exist."),

    /**
     * Invalid tenant reference
     */
    InvalidTenantId(1110, "租户不存在。", "Tenant does not exist."),

    /**
     * Invalid tenant reference
     */
    InvalidTenantToken(1120, "租户不存在。", "Tenant does not exist."),

    /**
     * The Duplicate badge id.
     */
    InvalidBadgeId(1199, "用户工号不能为空", "User BadgeId Invalid."),
    DuplicateBadgeId(1200, "工号已在使用中。", "user badgeId already in use"),

    /**
     * The Duplicate cellphone.
     */
    DuplicateCellphone(1201, "手机号已在使用中。", "user cellphone already in use"),

    /**
     * The Duplicate email.
     */
    DuplicateEmail(1202, "邮箱已在使用中。", "user email already in use"),

    /**
     * The Duplicate id number.
     */
    DuplicateIdNumber(1203, "身份证号已在使用中", "id number already in use"),

    /**
     * The Invalid user.
     */
    InvalidUser(1204, "未找到用户", "User not found."),
    /**
     * The User is active.
     */
    UserIsActive(1205, "用户已是启用状态", "User is already in active status"),
    /**
     * The User is deactive.
     */
    UserIsDeactive(1206, "用户已是停用状态", "User is already in deactive status"),
    /**
     * The Wrong old password.
     */
    WrongOldPassword(1207, "原密码错误", "Old password is wrong"),
    /**
     * The Missing audit log required field.
     */
    MissingAuditLogRequiredField(1208, "缺少用户日志的必填字段。", "Missing required fields for auditLog."),
    /**
     * The Add audit log fail.
     */
    AddAuditLogFail(1209, "增加用户日志失败", "AuditLog add fail"),
    SearchAlarmFail(1300,"查询告警分页列表失败","Search alarm fail"),
    ExportAlarmListFail(1301,"导出告警事件查询列表失败","Export alarm list fail"),
    AlarmIsAbsent(1302,"告警不存在","Alarm is absent"),
    HandleAlarmFail(1303,"处警失败","Handle alarm fail"),

    InvalidIP(1304,"无效的IP地址","Invalid IP address"),

    AddAlarmFail(1305,"新增告警失败","Add alarm fail"),

    CameraIpAbsent(1306,"摄像机IP不存在","Camera IP Absent"),

    AnalyzerIpAbsent(1307,"视频分析仪IP不存在","Analyzer IP Absent"),

    InvalidRtspUrl(1304,"无效的RTSP地址","Invalid RTSP address"),

    GetNotHandledCountFail(1309,"获取未处理告警总数失败","get not handled count fail"),

    /**
     * statistics
     */
    AlarmCountFail(1401,"获取报警事件总数目失败","Alarm count fail"),
    AlarmTypeOrderFail(1402,"获取报警算法类型排行失败","Alarm type order fail"),
    AlarmSettledRateOrderFail(1403,"获取报警算法处理率排行失败","Alarm settled rate order fail"),
    AlarmTrendFail(1404,"获取报警趋势失败","Alarm trend fail"),

    /*******
     * DEPARTMENT
     ********/
    /**
     * department code already used
     */
    DuplicateDepartmentToken(2000, "部门标识已在使用中。", "department token already in use."),

    /**
     * The Duplicate department s name.
     */
    DuplicateDepartmentSName(2001, "部门简称已在使用中。", "department shortName already in use."),

    /**
     * The Duplicate department f name.
     */
    DuplicateDepartmentFName(2002, "部门全称已在使用中。", "department fullName already in use."),

    /**
     * The Invalid department.
     */
    InvalidDepartment(2003, "未找到部门", "Department not found."),
    /**
     * The Department is active.
     */
    DepartmentIsActive(2004, "部门已是启用状态", "Department is already in active status"),
    /**
     * The Department is deactive.
     */
    DepartmentIsDeactive(2005, "部门已是停用状态", "Department is already in deactive status"),


    /**
     * The Invalid department level.
     */
    InvalidDepartmentLevel(2006, "部门层级已达最大值", "parent level reach the maximum."),

    /**
     * The Missing department required field.
     */
    MissingDepartmentRequiredField(2007, "缺少部门的必填字段", "Missing required fields for department"),

    /**
     * The Duplicate role token.
     */
    DuplicateRoleToken(3000, "角色编码已在使用中。", "role token already in use."),

    /**
     * The Duplicate role name.
     */
    DuplicateRoleName(3001, "角色名称已在使用中。", "role name already in use."),

    /**
     * The Invalid role.
     */
    InvalidRole(3002, "未找到角色", "Role not found."),

    /**
     * The Role is active.
     */
    RoleIsActive(3003, "角色已是启用状态", "Role is already in active status"),
    /**
     * The Role is deactive.
     */
    RoleIsDeactive(3004, "角色已是停用状态", "Role is already in deactive status"),
    /**
     * The Role Not deactive.
     */
    RoleNotDeactive(3006, "有用户在使用该角色，不能停用", "Role not deactive"),
    /**
     * The Missing role required field.
     */
    MissingRoleRequiredField(3005, "缺少角色的必填字段", "Missing required fields for role"),

    /**
     * The Invalid index.
     */
    InvalidIndex(3601, "未找到系统参数索引", "Dictionary Index not found."),
    /**
     * The Duplicate index code.
     */
    DuplicateIndexCode(3602, "系统参数索引编码已在使用中。", "Dictionary Index code already in use."),
    /**
     * The Duplicate index name.
     */
    DuplicateIndexName(3603, "系统参数索引名称已在使用中。", "Dictionary Index name already in use."),
    /**
     * The Missing index required field.
     */
    MissingIndexRequiredField(3604, "缺少系统参数索引的必填字段", "Missing required fields for dictionaryIndex"),

    /**
     * The Invalid dictionary.
     */
    InvalidDictionary(3604, "未找到系统参数", "Dictionary not found."),
    /**
     * The Dictionary is active.
     */
    DictionaryIsActive(3605, "系统参数已是启用状态", "Dictionary is already in active status"),
    /**
     * The Dictionary is deactive.
     */
    DictionaryIsDeactive(3606, "系统参数已是停用状态", "Dictionary is already in deactive status"),
    /**
     * The Duplicate dictionary code.
     */
    DuplicateDictionaryCode(3607, "参数项编码已在其索引参数中存在", "dictionary dataCode already in use."),
    /**
     * The Duplicate dictionary value.
     */
    DuplicateDictionaryValue(3608, "参数项值已在其索引参数中存在", "dictionary dataValue already in use."),
    /**
     * The Missing dictionary required field.
     */
    MissingDictionaryRequiredField(3605, "缺少系统参数项的必填字段", "Missing required fields for dictionary"),

    /**
     * Bad username
     */
    InvalidRefreshToken(1234, "刷新令牌不存在。", "Refresh token does not exist."),


    /***************************
     * INVALID OR DUPLICATE ID *
     ***************************/

    /**
     * Malformed device hardware id
     */
    MalformedHardwareId(4010,
            "硬件ID必须包含带有破折号，下划线且没有空格的字母数字值。", "Hardware id must consist of alphanumeric values with dashes, underscores, and no spaces."),

    /**
     * Generic duplicate id error
     */
    DuplicateId(4020, "给定的ID已经在使用中", "The given id is already in use"),

    /******************
     * LINE *
     ******************/
    /**
     * Invalid line token
     */
    InvalidLineToken(301, "当前线路信息不存在！", "line information not found."),
    /**
     * Duplicate line token
     */
    DuplicateLineToken(302, "当前标识已重复！", "line token already in use."),

    /******************
     * LOCATION *
     ******************/
    /**
     * Invalid location token
     */
    InvalidLocationToken(303, "当前位置信息不存在", "location information not found"),

    /**
     * Invalid location token
     */
    DuplicateLocationToken(304, "当前标识已重复！", "location token already in use."),

    /**
     * Invalid levelCode
     */
    InvalidCodeSeed(305, "层级码超出最大层级8级。", "levelCode is out of max length."),

    /******************
     * systemClassify *
     ******************/
    /**
     * Invalid systemClassify token
     */
    InvalidSystemClassifyToken(306, "当前系统分类信息不存在！", "systemClassify information not found"),

    /**
     * Invalid systemClassify token
     */
    DuplicateSystemClassifyToken(307, "当前标识已重复！", "systemClassify token already in use."),

    /**
     * The Invalid system classify id.
     */
    InvalidSystemClassifyId(308, "当前系统分类信息不存在", "systemClassify not found"),

    /******************
     * gateway *
     ******************/
    /**
     * Duplicate gateway token
     */
    InvalidGatewayToken(309, "当前网关信息不存在！", "gateway information not found."),

    /**
     * Invalid gateway token
     */
    DuplicateGatewayToken(310, "当前标识已重复！", "gateway token already in use."),

    /******************
     * application *
     ******************/
    /**
     * Invalid application token
     */
    InvalidApplicationToken(311, "当前应用信息不存在！", "application information not found"),

    /**
     * Invalid application token
     */
    DuplicateApplicationToken(312, "应用标识已存在！", "application token already in use."),

    /******************
     * alarmTypeConfig *
     ******************/
    /**
     * Invalid alarmTypeConfig
     */
    InvalidAlarmTypeConfig(313, "当前告警类型信息不存在！", "alarmTypeConfig information not found"),
    /**
     * The Duplicate alarmTypeConfig name.
     */
    DuplicateAlarmTypeConfigName(314, "告警类型名称已重复！", "alarmTypeConfig name already in use."),

    /******************
     * alarmLevelConfig *
     ******************/
    /**
     * Invalid alarmLevelConfig
     */
    InvalidAlarmLevelConfig(315, "当前告警级别信息不存在！", "alarmLevelConfig information not found"),
    /**
     * The Duplicate alarmTypeConfig name.
     */
    DuplicateAlarmLevelConfigName(316, "告警级别名称已重复！", "alarmLevelConfig name already in use."),
    /**
     * The Duplicate alarmTypeConfig level.
     */
    DuplicateAlarmLevelConfigLevel(317, "当前范围区间存在重叠。", "alarmLevelConfig level already in use."),

    DuplicateAlarmLevelConfigColor(318, "当前颜色已被使用。", "alarmLevelConfig color already in use."),

    NowUserSearchDataPermissionError(319, "查询当前用户数据权限失败。", "Search now user's data permission failed."),

    NowUserHasNoDataPermission(320, "查询当前用户没有数据权限。", "Now user has no data permission."),


    /******************
     * dataPermission *
     ******************/
    /**
     * Invalid dataPermission
     */
    InvalidDataPermission(311, "当前数据配置信息不存在！", "dataPermission information not found"),

    /***********
     * SYSTEM *
     ***********/
    /**
     * Invalid System token
     */
    DuplicateSystemToken(2060, "系统标识已在使用中。", "System token already in use."),
    /**
     * Duplicate System token
     */
    InvalidSystemToken(2080, "找不到系统标识。", "System token not found."),
    /**
     * System token don't match deviceType
     */
    NotMatchSystemToken(2081, "产品类型与系统不匹配。", "System token don't match deviceType."),

    /**
     * Metadata token don't match deviceType
     */
    NotMatchMetadataToken(2082, "元数据标识与产品不匹配。", "Metadata token don't match deviceType."),

    /*********
     * Fault Code *
     *********/
    InvalidConfiguration(5160, "未找到工单配置", "Configuration not found."),

    InvalidFaultCode(5760, "未找到故障码", "Fault code not found."),
    DuplicatedFaultCode(5760, "故障码重复", "Fault code duplicated."),


    /**
     * The Invalid paramter.
     */
    InvalidParamter(11301, "无效的查询参数", "Paramter is invalid."),

    /**
     * The Invalid contact.
     */
    InvalidContact(11302, "联系人不存在", "Contact not found."),

    /**
     * The Duplicate contact name.
     */
    DuplicateContactName(11303, "联系人姓名已存在", "Contact name already in use."),
    /**
     * The Duplicate contact cellphone.
     */
    DuplicateContactCellphone(11304, "联系人手机号已存在", "Contact cellphone already in use."),
    /**
     * The Duplicate contact email.
     */
    DuplicateContactEmail(11305, "联系人邮箱已存在", "Contact email already in use."),

    /**
     * Request for label generator that does not exist
     */
    LabelGeneratorNotFound(12000, "找不到请求的标签生成器。", "The requested label generator was not found."),

    /******************
     * Template *
     */
    DuplicateTemplateToken(12010, "模板标识已被使用.", "Template token already in use."),

    /**
     * The Invalid template.
     */
    InvalidTemplate(12011, "模板未找到.", "Template not found."),

    /***********
     * GENERIC *
     ***********/

    /**
     * Generic delete failure message
     */
    GenericDeleteFailed(13000, "删除失败。", "Delete unsuccessful."),


    /*********
     * OTHER *
     */
    ResetPasswordError(500, "重置用户密码失败", "Failed to reset user password, " +
            "please check if the link has expired"),
    RecordAlreadyExist(16000, "相同记录已存在", "Same Record already exist"),
    RecordNotExist(16010, "未找到相关记录", "Record does not exist"),
    InvalidParameter(400000, "参数错误", "Parameter not found."),

    /**
     * Error with no explanation
     */
    Unknown(99999, "未知错误。", "Unknown error."),



    InvalidParam(77777, "无效的查询参数", "Param is invalid."),

    InvalidModelDuplicate(78888, "数据库中已存在同样一条数据", "Param is invalid."),


    SearchVideoAnalyzerPageListFailed(5000,"查询视频分析仪分页列表失败","Search video analyzer page list failed"),
    CreateVideoAnalyzerFailed(5001,"创建视频分析仪失败","Create video analyzer failed"),
    UpdateVideoAnalyzerFailed(5002,"修改视频分析仪失败","Update video analyzer failed"),
    DisableVideoAnalyzerFailed(5003,"停用视频分析仪失败","Disable video analyzer failed"),
    EnableVideoAnalyzerFailed(5004,"启用视频分析仪失败","Enable video analyzer failed"),
    GetVideoAnalyzerInfoFailed(5005,"查看视频分析仪信息失败","Get video analyzer info failed"),
    VideoAnalyzerIsNotExited(5006,"视频分析仪不存在！","Video analyzer is not existed"),
    ThisVideoAnalyzerHasBeenEnabled(5007,"视频分析仪已启用！无法再次启用!","Video analyzer has been enabled! Cannot enable again."),
    ThisVideoAnalyzerHasBeenDisabled(5008,"视频分析仪已停用！无法再次停用！","Video analyzer has been disabled! Cannot disable again."),
    ThereHasSameNameVideoAnalyzerAndCannotSave(5009,"存在同名视频分析仪！无法保存！","There has the same name of video analyzer and cannot save."),
    SaveAnalyzerAlgorithmConfigFailed(5010,"保存视频分析仪算法配置失败！","Save analyzer algorithm config failed."),
    UpdateAnalyzerAlgorithmConfigFailed(5011,"修改视频分析仪算法配置失败！","Update analyzer algorithm failed."),
    GetAnalyzerAlgorithmConfigFailed(5012,"获取视频分析仪算法配置失败！","Get analyzer algorithm failed."),
    DataErrorOccurWhenSaveAnalyzerAlgorithmConfig(5013,"保存视频分析仪算法配置时发生数据错误！","Data error occur when save analyzer algorithm config."),
    SendAnalyzerAlgorithmFailed(5014,"下发视频分析仪算法配置失败！","Send analyzer algorithm config failed."),
    // 算法状态
    AlgorithmRestarting(5015,"算法正在重启中！","The algorithm is being restarted."),
    AlgorithmDisabled(5016,"算法已停用！","The algorithm has been disabled."),
    AlgorithmPaused(5017,"算法已暂停！","The algorithm has been disabled."),
    AlgorithmEnabled(5018,"算法已启用！","The algorithm has been enabled."),

    // minio获取文件流
    MinioGetFileStreamFiled(88888,"获取文件流信息失败！","Get minio file stream failed.")

    ;

    /**
     * Numeric code
     */
    private long code;

    /**
     * Error message
     */
    private String message;
    /**
     * English Error message
     */
    private String englishMessage;

    ErrorCode(long code, String message, String englishMessage) {
        this.setCode(code);
        this.setMessage(message);
        this.setEnglishMessage(englishMessage);
    }

    /**
     * Look up the enum based on error code.
     *
     * @param code the code
     * @return error code
     */
    public static ErrorCode fromCode(long code) {
        for (ErrorCode current : values()) {
            if (current.getCode() == code) {
                return current;
            }
        }
        throw new RuntimeException("Invalid error code: " + code);
    }

    /**
     * Gets code.
     *
     * @return the code
     */
    public long getCode() {
        return code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    public void setCode(long code) {
        this.code = code;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets english message.
     *
     * @return the english message
     */
    public String getEnglishMessage() {
        return englishMessage;
    }

    /**
     * Sets english message.
     *
     * @param englishMessage the english message
     */
    public void setEnglishMessage(String englishMessage) {
        this.englishMessage = englishMessage;
    }
}

