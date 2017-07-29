
public class FwSlash {
	public static void main(String args[]) {

		String withSlash = "google.com/Sagar";
		System.out.println("withSlash = " + withSlash);

		String withRemovedSlash = "google.com/Sagar1.1";

		int slashIndex = withRemovedSlash.lastIndexOf("/");
		System.out.println("withRemovedSlash = "
				+ withRemovedSlash.lastIndexOf("/"));

		withRemovedSlash = withRemovedSlash.substring(0, slashIndex);

		System.out.println("withRemovedSlas232h = " + withRemovedSlash);

		withSlash = withSlash.replaceAll("/", "\\\\ ");
		System.out.println("withSlash = " + withSlash);

	}

}
