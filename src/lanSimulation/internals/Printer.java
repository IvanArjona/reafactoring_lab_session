package lanSimulation.internals;

public class Printer extends NodeType {

	@Override
	public byte getCode() {
		return NodeType.PRINTER;
	}
	
	@Override
	public void printOn(StringBuffer buf, String name) {
		buf.append("Printer ");
		buf.append(name);
		buf.append(" [Printer]");
	}
	
	@Override
	public void printOnHTML(StringBuffer buf, String name) {
		buf.append("<printer>");
		buf.append(name);
		buf.append("</printer>");
	}

}
