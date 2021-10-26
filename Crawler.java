import java.io.File;

public class Crawler {
	public static void main(String[] args) {
		File root = new File(args[0]);
		crawl(root);
	}

	public static void crawl(File file) {
		crawl(file, "");
	}

	private static void crawl(File file, String indent) {
		System.out.println(indent + file.getName());
		if (file.isDirectory()) {
			for (File subfile : file.listFiles()) {
				crawl(subfile, indent + "    ");
			}
		}
	}
}
