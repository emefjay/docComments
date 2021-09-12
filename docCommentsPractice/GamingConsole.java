package docCommentsPractice;

/**
 * 
 * @author emmajuvenal
 *The Gaming Console class.
 *
 *requires 
 */
public class GamingConsole {

	private String consoleName;
	private String companyName;
	private int releaseYear;
	private static int consoleCounter = 0;
	private int uniqueId;

	/**
	 * Constructor for class GamingConsole.
	 * Includes parameters:
	 * @param consoleName
	 * @param companyName
	 * @param releaseYear
	 * Also includes a uniqueId property, which creates a new id for every new GamingConsole object created. 
	 */
	public GamingConsole(String consoleName, String companyName, int releaseYear) {
		this.consoleName = consoleName;
		this.companyName = companyName;
		this.releaseYear = releaseYear;
		this.uniqueId = 1234567 + consoleCounter++;
		this.consoleCounter = consoleCounter++;
	}

	/**
	 * @return the consoleName
	 */
	public String getConsoleName() {
		return consoleName;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @return the releaseYear
	 */
	public int getReleaseYear() {
		return releaseYear;
	}

	/**
	 * @return the uniqueId
	 */
	public int getUniqueId() {
		return uniqueId;
	}
	/**
	 * Prints properties of the GamingConsole object in String format.
	 */
	@Override
	public String toString() {
		return String.format(companyName + " " + releaseYear + " " + consoleName + " id: " + uniqueId);
	}

}
