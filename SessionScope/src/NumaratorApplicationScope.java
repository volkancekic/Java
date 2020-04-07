import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@ApplicationScoped
public class NumaratorApplicationScope {
	private int value = 0;
	public void increment(){
		value++;
	}
	public NumaratorApplicationScope() {
		
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
