
public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle() {
		super();
		this.width=0;
		this.height=0;
	}	
	public Rectangle(double width, double height) {
		super();
		if(width>0) {
			this.width = width;
			}else {
				this.width=0;
			}
		if(height>0) {
			this.height = height;
			}else {
				this.height=0;
			}
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if(width>0) {
		this.width = width;
		}else {
			this.width=0;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height>0) {
			this.height = height;
			}else {
				this.height=0;
			}
	}
	public int getArea() {
		if(height==0 || width==0) {
			return 0;
		}
		return (int)(height*width);
	}
	public int getCircumference() {
		if(height==0 || width==0) {
			return 0;
		}
		return (int)(2*(width+height));
	}
	
}
