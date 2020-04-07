import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class NumaratorSessionScope {
	private int value = 0;
	public void increment(){
		value++;
	}
	public NumaratorSessionScope() {
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
