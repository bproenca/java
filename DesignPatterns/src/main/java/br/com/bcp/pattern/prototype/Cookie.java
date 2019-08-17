package br.com.bcp.pattern.prototype;

/** Prototype Class * */
public class Cookie implements Cloneable {

	private String nome;
	private long timeClone;

	/**
	 * @param pNome
	 */
	public Cookie(final String pNome) {
		super();
		nome = pNome;
	}

	@Override
	public Object clone() {
		try {
			final Cookie copy = (Cookie) super.clone();

			// In an actual implementation of this pattern you might now change
			// references to
			// the expensive to produce parts from the copies that are held
			// inside the prototype.

			copy.setTimeClone(System.currentTimeMillis());
			return copy;

		} catch (final CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return the time
	 */
	public long getTimeClone() {
		return timeClone;
	}

	/**
	 * @param pNome
	 *            the nome to set
	 */
	public void setNome(final String pNome) {
		nome = pNome;
	}

	/**
	 * @param pTime
	 *            the time to set
	 */
	public void setTimeClone(final long pTime) {
		timeClone = pTime;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ntimeClone: " + timeClone;
	}
}