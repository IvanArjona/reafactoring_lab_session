package lanSimulation.internals;

public class WorkStation extends NodeType {

	@Override
	public byte getCode() {
		return NodeType.WORKSTATION;
	}
	
	@Override
	public void printOn(StringBuffer buf, String name) {
		buf.append("Workstation ");
		buf.append(name);
		buf.append(" [Workstation]");
	}
	
	@Override
	public void printOnHTML(StringBuffer buf, String name) {
		buf.append("<workstation>");
		buf.append(name);
		buf.append("</workstation>");
	}

}
