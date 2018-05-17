package lanSimulation.internals;

public class DefaultNode extends NodeType {

	@Override
	public byte getCode() {
		return NodeType.NODE;
	}
	
	@Override
	public void printOn(StringBuffer buf, String name) {
		buf.append("Node ");
		buf.append(name);
		buf.append(" [Node]");
	}
	
	@Override
	public void printOnHTML(StringBuffer buf, String name) {
		buf.append("<node>");
		buf.append(name);
		buf.append("</node>");
	}

}
