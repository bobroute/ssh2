package com.demo.util;

public class StringHelper {
	/**
	 * JAVA�ж��ַ����������Ƿ����ĳ�ַ���Ԫ��
	 * 
	 * @param substring
	 *            ĳ�ַ���
	 * @param source
	 *            Դ�ַ�������
	 * @return �����򷵻�true�����򷵻�false
	 */
	public static boolean isIn(String substring, String[] source) {
		if (source == null || source.length == 0) {
			return false;
		}
		for (int i = 0; i < source.length; i++) {
			String aSource = source[i];
			if (aSource.equals(substring)) {
				return true;
			}
		}
		return false;
	}
}
