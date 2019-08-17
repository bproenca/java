package br.com.bcp.pattern.facade;

class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("Reading");
		return null;
	}
}
