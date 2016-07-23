
public class UtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(PinyinUtils.getPinyin("黑马"));
		System.out.println(PinyinUtils.getPinyin("黑  马"));
		System.out.println(PinyinUtils.getPinyin("a 黑&^马 1"));
		System.out.println(PinyinUtils.getPinyin("黑马程序员"));
		
	}

}
