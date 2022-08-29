package teacher.informations;

import core.Queue;
import core.Stack;

public interface LectureInfos {
	
	Stack lectures = new Stack(); //dersler(isimleri) burada tutuluyor
	Stack numericAnalysis = new Stack(); //this stack contains numeric's subjects
	Stack dataStructers = new Stack(); 
	Stack computersNetworks = new Stack();
	Stack dataScience = new Stack();
	Stack computerOrganization = new Stack();
	Queue yoklama = new Queue(); //derste bulunan öðrenciler için
	
	
}
