package vo;

import javax.swing.ImageIcon;

import common.enums.PlayerPosition;
import common.mydatastructure.Date;
import common.mydatastructure.Height;
import common.mydatastructure.Weight;

import po.GeneralInfoOfPlayerPo;

public class GeneralInfoOfPlayerVo {

	private String playerName;// 姓名
	private String playerNumber;// 球员号码
	private ImageIcon portraitImageIcon;// 半身头像
	private ImageIcon actionImageIcon;// 全身像
	private PlayerPosition position;// 位置
	private Height height;// 身高
	private Weight weight;// 体重
	private Date birthday;// 生日
	private int age;
	private int trainingYear;// 球龄
	private String school;// 毕业学校

	public GeneralInfoOfPlayerVo() {
		// 无参构造函数
	}

	public GeneralInfoOfPlayerVo(GeneralInfoOfPlayerPo po) {
		this.playerName = po.getName();
		this.playerNumber = po.getNumber();
		this.portraitImageIcon = po.getPortraitImageIcon();
		this.actionImageIcon = po.getActionImageIcon();
		this.position = po.getPosition();
		this.height = po.getHeight();
		this.weight = po.getWeight();
		this.birthday = po.getBirthday();
		this.trainingYear = po.getTrainingYear();
		this.age = po.getAge();
		this.trainingYear = po.getTrainingYear();
		this.school = po.getShool();
	}// 以po为参数的构造方法

	public void setPortraitImageIcon(ImageIcon portraitImageIcon) {
		this.portraitImageIcon = portraitImageIcon;
	}// 设置球员头像

	public void setActionImageIcon(ImageIcon actionImageIcon) {
		this.actionImageIcon = actionImageIcon;
	}// 设置全身像

	public void setName(String playerName) {
		this.playerName = playerName;
	}// 设置球员的姓名

	public void setNumber(String playerNumber) {
		this.playerNumber = playerNumber;
	}// 设置球员号码

	public void setPosition(PlayerPosition position) {
		this.position = position;
	}// 设置球员的位置

	public void setHeight(Height height) {
		this.height = height;
	}// 设置球员的身高

	public void setWeight(Weight weight) {
		this.weight = weight;
	}// 设置球员的体重

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}// 设置球员的生日

	public void setAge(int age) {
		this.age = age;
	}// 设置球员年龄

	public void setTrainingYear(int trainingYear) {
		this.trainingYear = trainingYear;
	}// 设置球员的球龄

	public void setShool(String school) {
		this.school = school;
	}// 设置球员的毕业学校
		// //////////////////////////////////////////////////////////////

	public ImageIcon getPortraitImageIcon() {
		return this.portraitImageIcon;
	}// 得到球员头像

	public ImageIcon getActionImageIcon() {
		return this.actionImageIcon;
	}// 得到全身像

	public String getName() {
		return this.playerName;
	}// 得到球员的姓名

	public String getNumber() {
		return this.playerNumber;
	}// 得到球员号码

	public PlayerPosition getPosition() {
		return this.position;
	}// 得到球员的位置

	public Height getHeight() {
		return this.height;
	}// 得到球员的身高

	public Weight getWeight() {
		return this.weight;
	}// 得到球员的体重

	public Date getBirthday() {
		return this.birthday;
	}// 得到球员的生日

	public int getAge() {
		return this.age;
	}// 得到球员年龄

	public int getTrainingYear() {
		return this.trainingYear;
	}// 得到球员的球龄

	public String getShool() {
		return this.school;
	}// 得到球员的毕业学校
}
