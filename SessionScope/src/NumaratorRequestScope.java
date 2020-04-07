import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class NumaratorRequestScope {
	private int value = 0;
	public void increment(){
		value++;
	}
	public NumaratorRequestScope() {
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
