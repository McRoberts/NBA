package vo;

public class OneTeamPerformOfOneSeasonVo {
	private String teamName;// 球队名称
	private int numberOfMatch;// 比赛场数
	//
	private int totalHitNumber;// 总命中数
	private int totalShootNumber;// 总出手数
	private int threePointHitNumber;// 三分命中数
	private int threePointShootNumber;// 三分出手数
	private int freePointHitNumber;// 罚球命中数
	private int freePointShootNumber;// 罚球出手数
	private int offensiveReboundNumber;// 进攻篮板数
	private int defensiveReboundNumber;// 防守篮板
	private int totalReboundNumber;// 总篮板
	private int assistNumber;// 总助攻
	private int stealNumber;// 抢断数
	private int blockNumber;// 盖帽数
	private int turnoverNumber;// 失误数
	private int foulNumber;// 犯规数
	private int scoreNumber;// 得分数
	private int offensiveNumber;// 进攻回合数
	//
	private int averageTotalHitNumber;// 场均命中数
	private int averageTotalShootNumber;// 场均总出手数
	private int averageThreePointHitNumber;// 场均三分命中数
	private int averageThreePointShootNumber;// 场均三分出手数
	private int averageFreePointHitNumber;// 场均罚球命中数
	private int averageFreePointShootNumber;// 场均罚球出手数
	private int averageOffensiveReboundNumber;// 场均进攻篮板数
	private int averageDefensiveReboundNumber;// 场均防守篮板
	private int averageTotalReboundNumber;// 场均总篮板
	private int averageAssistNumber;// 场均助攻数
	private int averageStealNumber;// 场均抢断数
	private int averageBlockNumber;// 场均盖帽数
	private int averageTurnoverNumber;// 场均失误数
	private int averageFoulNumber;// 场均犯规数
	private int averageScoreNumber;// 场均得分数
	private int averageOffensiveNumber;// 场均进攻回合数
	//
	private double totalHitRate;// 投篮命中率
	private double threePointHitRate;// 三分命中率
	private double freePointHitRate;// 罚球命中率
	private double winRate;// 胜率
	private double offensiveEfficiency;// 进攻效率
	private double defensiveEfficiency;// 防守效率
	private double reboundEfficiency;// 篮板效率
	private double stealEfficiency;// 抢断率
	private double assistEfficiency;// 助攻率

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNumberOfMatch() {
		return numberOfMatch;
	}

	public void setNumberOfMatch(int numberOfMatch) {
		this.numberOfMatch = numberOfMatch;
	}

	public int getTotalHitNumber() {
		return totalHitNumber;
	}

	public void setTotalHitNumber(int totalHitNumber) {
		this.totalHitNumber = totalHitNumber;
	}

	public int getTotalShootNumber() {
		return totalShootNumber;
	}

	public void setTotalShootNumber(int totalShootNumber) {
		this.totalShootNumber = totalShootNumber;
	}

	public int getThreePointHitNumber() {
		return threePointHitNumber;
	}

	public void setThreePointHitNumber(int threePointHitNumber) {
		this.threePointHitNumber = threePointHitNumber;
	}

	public int getThreePointShootNumber() {
		return threePointShootNumber;
	}

	public void setThreePointShootNumber(int threePointShootNumber) {
		this.threePointShootNumber = threePointShootNumber;
	}

	public int getFreePointHitNumber() {
		return freePointHitNumber;
	}

	public void setFreePointHitNumber(int freePointHitNumber) {
		this.freePointHitNumber = freePointHitNumber;
	}

	public int getFreePointShootNumber() {
		return freePointShootNumber;
	}

	public void setFreePointShootNumber(int freePointShootNumber) {
		this.freePointShootNumber = freePointShootNumber;
	}

	public int getOffensiveReboundNumber() {
		return offensiveReboundNumber;
	}

	public void setOffensiveReboundNumber(int offensiveReboundNumber) {
		this.offensiveReboundNumber = offensiveReboundNumber;
	}

	public int getDefensiveReboundNumber() {
		return defensiveReboundNumber;
	}

	public void setDefensiveReboundNumber(int defensiveReboundNumber) {
		this.defensiveReboundNumber = defensiveReboundNumber;
	}

	public int getTotalReboundNumber() {
		return totalReboundNumber;
	}

	public void setTotalReboundNumber(int totalReboundNumber) {
		this.totalReboundNumber = totalReboundNumber;
	}

	public int getAssistNumber() {
		return assistNumber;
	}

	public void setAssistNumber(int assistNumber) {
		this.assistNumber = assistNumber;
	}

	public int getStealNumber() {
		return stealNumber;
	}

	public void setStealNumber(int stealNumber) {
		this.stealNumber = stealNumber;
	}

	public int getBlockNumber() {
		return blockNumber;
	}

	public void setBlockNumber(int blockNumber) {
		this.blockNumber = blockNumber;
	}

	public int getTurnoverNumber() {
		return turnoverNumber;
	}

	public void setTurnoverNumber(int turnoverNumber) {
		this.turnoverNumber = turnoverNumber;
	}

	public int getFoulNumber() {
		return foulNumber;
	}

	public void setFoulNumber(int foulNumber) {
		this.foulNumber = foulNumber;
	}

	public int getScoreNumber() {
		return scoreNumber;
	}

	public void setScoreNumber(int scoreNumber) {
		this.scoreNumber = scoreNumber;
	}

	public int getOffensiveNumber() {
		return offensiveNumber;
	}

	public void setOffensiveNumber(int offensiveNumber) {
		this.offensiveNumber = offensiveNumber;
	}

	public int getAverageTotalHitNumber() {
		return averageTotalHitNumber;
	}

	public void setAverageTotalHitNumber(int averageTotalHitNumber) {
		this.averageTotalHitNumber = averageTotalHitNumber;
	}

	public int getAverageTotalShootNumber() {
		return averageTotalShootNumber;
	}

	public void setAverageTotalShootNumber(int averageTotalShootNumber) {
		this.averageTotalShootNumber = averageTotalShootNumber;
	}

	public int getAverageThreePointHitNumber() {
		return averageThreePointHitNumber;
	}

	public void setAverageThreePointHitNumber(int averageThreePointHitNumber) {
		this.averageThreePointHitNumber = averageThreePointHitNumber;
	}

	public int getAverageThreePointShootNumber() {
		return averageThreePointShootNumber;
	}

	public void setAverageThreePointShootNumber(int averageThreePointShootNumber) {
		this.averageThreePointShootNumber = averageThreePointShootNumber;
	}

	public int getAverageFreePointHitNumber() {
		return averageFreePointHitNumber;
	}

	public void setAverageFreePointHitNumber(int averageFreePointHitNumber) {
		this.averageFreePointHitNumber = averageFreePointHitNumber;
	}

	public int getAverageFreePointShootNumber() {
		return averageFreePointShootNumber;
	}

	public void setAverageFreePointShootNumber(int averageFreePointShootNumber) {
		this.averageFreePointShootNumber = averageFreePointShootNumber;
	}

	public int getAverageOffensiveReboundNumber() {
		return averageOffensiveReboundNumber;
	}

	public void setAverageOffensiveReboundNumber(int averageOffensiveReboundNumber) {
		this.averageOffensiveReboundNumber = averageOffensiveReboundNumber;
	}

	public int getAverageDefensiveReboundNumber() {
		return averageDefensiveReboundNumber;
	}

	public void setAverageDefensiveReboundNumber(int averageDefensiveReboundNumber) {
		this.averageDefensiveReboundNumber = averageDefensiveReboundNumber;
	}

	public int getAverageTotalReboundNumber() {
		return averageTotalReboundNumber;
	}

	public void setAverageTotalReboundNumber(int averageTotalReboundNumber) {
		this.averageTotalReboundNumber = averageTotalReboundNumber;
	}

	public int getAverageAssistNumber() {
		return averageAssistNumber;
	}

	public void setAverageAssistNumber(int averageAssistNumber) {
		this.averageAssistNumber = averageAssistNumber;
	}

	public int getAverageStealNumber() {
		return averageStealNumber;
	}

	public void setAverageStealNumber(int averageStealNumber) {
		this.averageStealNumber = averageStealNumber;
	}

	public int getAverageBlockNumber() {
		return averageBlockNumber;
	}

	public void setAverageBlockNumber(int averageBlockNumber) {
		this.averageBlockNumber = averageBlockNumber;
	}

	public int getAverageTurnoverNumber() {
		return averageTurnoverNumber;
	}

	public void setAverageTurnoverNumber(int averageTurnoverNumber) {
		this.averageTurnoverNumber = averageTurnoverNumber;
	}

	public int getAverageFoulNumber() {
		return averageFoulNumber;
	}

	public void setAverageFoulNumber(int averageFoulNumber) {
		this.averageFoulNumber = averageFoulNumber;
	}

	public int getAverageScoreNumber() {
		return averageScoreNumber;
	}

	public void setAverageScoreNumber(int averageScoreNumber) {
		this.averageScoreNumber = averageScoreNumber;
	}

	public int getAverageOffensiveNumber() {
		return averageOffensiveNumber;
	}

	public void setAverageOffensiveNumber(int averageOffensiveNumber) {
		this.averageOffensiveNumber = averageOffensiveNumber;
	}

	public double getTotalHitRate() {
		return totalHitRate;
	}

	public void setTotalHitRate(double totalHitRate) {
		this.totalHitRate = totalHitRate;
	}

	public double getThreePointHitRate() {
		return threePointHitRate;
	}

	public void setThreePointHitRate(double threePointHitRate) {
		this.threePointHitRate = threePointHitRate;
	}

	public double getFreePointHitRate() {
		return freePointHitRate;
	}

	public void setFreePointHitRate(double freePointHitRate) {
		this.freePointHitRate = freePointHitRate;
	}

	public double getWinRate() {
		return winRate;
	}

	public void setWinRate(double winRate) {
		this.winRate = winRate;
	}

	public double getOffensiveEfficiency() {
		return offensiveEfficiency;
	}

	public void setOffensiveEfficiency(double offensiveEfficiency) {
		this.offensiveEfficiency = offensiveEfficiency;
	}

	public double getDefensiveEfficiency() {
		return defensiveEfficiency;
	}

	public void setDefensiveEfficiency(double defensiveEfficiency) {
		this.defensiveEfficiency = defensiveEfficiency;
	}

	public double getReboundEfficiency() {
		return reboundEfficiency;
	}

	public void setReboundEfficiency(double reboundEfficiency) {
		this.reboundEfficiency = reboundEfficiency;
	}

	public double getStealEfficiency() {
		return stealEfficiency;
	}

	public void setStealEfficiency(double stealEfficiency) {
		this.stealEfficiency = stealEfficiency;
	}

	public double getAssistEfficiency() {
		return assistEfficiency;
	}

	public void setAssistEfficiency(double assistEfficiency) {
		this.assistEfficiency = assistEfficiency;
	}

}
