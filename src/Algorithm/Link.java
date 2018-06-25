package Algorithm;

public class Link {

	public Link(double lenght, Node to) {
		this.lenght = lenght;
		endPoint = to;
	}

	private double lenght;
	private LinkType type;
	private Node endPoint;

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public LinkType getType() {
		return type;
	}

	public void setType(LinkType type) {
		this.type = type;
	}

	public Node getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Node endPoint) {
		this.endPoint = endPoint;
	}

}
