package pack03_Interfaces;

import pack01_Interface.TestInterface;
import pack02_Interface.RemoteController;

//Interface 설계도도 상속이 가능하다.(extends)
//Interface의 특성은 extends가 다중으로 상속이 가능하다.
public interface Interface_Extends extends TestInterface
, RemoteController{
	void itest1();
	void itest2();

}
