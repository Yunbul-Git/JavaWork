package phonebook04.list;

import java.util.ArrayList;
import java.util.Date;

// CONTROLLER 객체
//   어플리케이션의 동작, 데이터 처리(CRUD), (Business logic 담당)
public class PhonebookManager implements pb {

	private ArrayList<PhonebookModel> pbList = new ArrayList<PhonebookModel>();

	// singleton적용
	private PhonebookManager() {
	}

	private static PhonebookManager instance = null;

	public static PhonebookManager getInstance() {
		if (instance == null) {
			instance = new PhonebookManager();
		}
		return instance;
	} // end getInstance()

	// 전화번호부 생성 등록
	@Override
	public int insert(String name, String phoneNum, String memo) {
		// 매개변수 검증 : 이름 필수
		if (name == null || name.trim().length() == 0) {
			throw new PhonebookException("insert() 이름입력오류 : 올바른 이름을 입력해주세요");
		}
		// 매개변수 검증 : 번호 필수
		if (phoneNum == null || name.trim().length() == 0) {
			throw new PhonebookException("insert() 전화번호입력오류 : 올바른 전화번호을 입력해주세요");
		}
		Date regdate = new Date();
		PhonebookModel input = new PhonebookModel(getMaxUid() + 1, name, phoneNum, memo, regdate);
		pbList.add(input);

		return 1;
	}

	@Override
	public PhonebookModel[] selectAll() {
		PhonebookModel[] a = new PhonebookModel[pbList.size()];
		for (int i = 0; i < pbList.size(); i++) {
			if (pbList.get(i) != null) {
				a[i] = pbList.get(i);
			}
		}
		return a;
	}

	// 특정 uid 의 데이터 검색 리턴
	// 못찾으면 null 리턴
	@Override
	public PhonebookModel selectByUid(int uid) {
		for (PhonebookModel pb : pbList) {
			if (pb.getUid() == uid) {
				return pb;
			}
		}
		return null; // 못찾으면 null 리턴
	}// end selectByUid()

	@Override
	public int updateByUid(int uid, String name, String phoneNum, String memo) {

		// 매개변수 검증
		if (uid < 1)
			throw new PhonebookException("update() uid 오류 : " + uid, pb.ERR_UID);
		if (name == null || name.trim().length() == 0)
			throw new PhonebookException("update() 이름입력 오류 : ", pb.ERR_EMPTY_STRING);

		// 특정 uid 값을 가진 데이터의 배열 인덱스 찾기
		int index = findIndexByUid(uid);
		if (index < 0)
			throw new PhonebookException("update() 없는 uid : " + uid, pb.ERR_UID);

		// TODO

		return 1;
	}

	@Override
	public int deleteByUid(int uid) {

		// 매개변수 검증
		if (uid < 1)
			throw new PhonebookException("delete() uid 오류 : " + uid, pb.ERR_UID);

		int index = findIndexByUid(uid);
		if (index < 0)
			throw new PhonebookException("delete() 없는 uid : " + uid, pb.ERR_UID);

		// TODO

		return 1;
	}

	// 현재 데이터중 가장 큰 uid 값을 찾아서 리턴
	private int getMaxUid() {
		int maxUid = 0;
		if (maxUid != 0) {
			maxUid++;
		}
		return maxUid;
	}

	// 특정 uid 값을 가진 데이터의 배열 인덱스 찾기
	// 못찾으면 -1 리턴
	private int findIndexByUid(int uid) {
//		for (int i = 0; i < pbList.size(); i++) {
//			if (pbList.get() == uid) {
//
//			}
//			return i;
//		}

		for (PhonebookModel pb : pbList) {
			if (pb.getUid() == uid) {
				return pbList.indexOf(pb.getUid());
			}
		}
		return -1;
	}

}// end PhonebookManager

// 예외 클래스 정의
// 예외발생하면 '에러코드' + '에러메세지'를 부여하여 관리하는게 좋다.
class PhonebookException extends RuntimeException {

	private int errCode = pb.ERR_GENERIC;

	public PhonebookException() {
		super("Phonebook 예외 발생");
	}

	public PhonebookException(String msg) {
		super(msg);
	}

	public PhonebookException(String msg, int errCode) {
		super(msg);
		this.errCode = errCode;
	}

	@Override
	public String getMessage() {
		String msg = "ERR-" + errCode + "]" + pb.ERR_STR[errCode] + " " + super.getMessage();
		return msg;
	}
}
