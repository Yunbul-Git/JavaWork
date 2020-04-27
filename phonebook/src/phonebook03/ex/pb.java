package phonebook03.ex;

// Controller 인터페이스
public interface pb {

	public static final String VERSION = "전화번호부 3.0";
	public abstract int insert(String name, String phoneNum, String memo); /* 1 */
	public abstract PhonebookModel[] selectAll(); /* 2 */
	public abstract PhonebookModel selectByUid(int uid); /* 3 */
	public abstract int updateByUid(int uid, String name, String phoneNum, String memo); /* 4 */
	public abstract int deleteByUid(int uid); /* 5 */
	// 에러코드 상수
	public static final int ERR_GENERIC = 0;// 인덱스 범위 초과
	public static final int ERR_INDEXOUTOFRANGE = 0;// 인덱스 범위 초과
	public static final int ERR_EMPTY_STRING = 0;// 인덱스 범위 초과
	public static final int ERR_UID = 0;// 인덱스 범위 초과
	// 입력문자열이 empty(혹은 null)인 경우
	// uid가 없는 경우
	
	// 에러문자열
	public static final String[] ERR_STR = {
			"일반오류", //0
			"인덱스오류", //1
			"문자열오류", //2
			"UID오류",  //3
	};
}
