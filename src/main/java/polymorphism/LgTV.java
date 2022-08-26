package polymorphism;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Component("tv")
public class LgTV implements TV {
	@Autowired // 객채를 자동으로 할당
//	@Qualifier("sony") //특정 객체의 이름을 이용하여 의존성 주입
//	@Resource(name="apple")
	
//	@Inject
//	@Named("sony")
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV ��ü ����");
	}

	public void powerOn() {
		System.out.println("LgTV---���� �Ҵ�.");
	}

	public void powerOff() {
		System.out.println("LgTV---���� ����.");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
