public class userPo {
	/*构造函数等的定义 by lsl 2017/12/2*/
	public userPo(Integer id, String name,int sex,int timetag,int area,
			int diffsex, int single,int sameroom,int subway,int ride,
			int price,int center,int animal,int music,int workstation,
			int game,int tablegame,int toursim,int health,int food,int
			quiet,int skill,int call,int open)
	{
		this.phId   = id;
		this.phName = name;
		this.phSex  = sex;
		this.phTimetag = timetag;
		this.phArea    = area;
		this.phDiffsex = diffsex;
		this.phSingle  = single;
		this.phSameroom = sameroom;
		this.phSubway  = subway;
		this.phRide    = ride;
		this.phPrice   = price;
		this.phCenter  = center;
		this.phAnimal  = animal;
		this.phMusic   = music;
		this.phWorkstation = workstation;
		this.phGame    = game;
		this.phTablegame = tablegame;
		this.phTourism = toursim;
		this.phHealth  = health;
		this.phFood    = food;
		this.phQuiet   = quiet;
		this.phSkill   = skill;
		this.phCall    = call;
		this.phOpen    = open;
	}
	public userPo()
	{}
	
	/*成员变量definition by lsl 2017/12/2*/
	private Integer phId;			   //主键
	private String phName;             //姓名
	private Integer phSex;             //性别
	private Integer phTimetag;   	   //入职时间
	private Integer phArea;    		   //租房区域
	private Integer phDiffsex;		   //接受异性混租
    private Integer phSingle;		   //
    private Integer phSameroom;		   //
    private Integer phSubway;		   //
    private Integer phRide;			   //
    private Integer phPrice;		   //价格
    private Integer phCenter;		   //
    private Integer phAnimal;	       //接受爱心宠物师
    private Integer phMusic;		   //接受音乐人
    private Integer phWorkstation;	   //工作地点
    private Integer phGame;			   //游戏爱好者
    private Integer phTablegame;	   //桌游爱好者{狼人杀、三国杀}
    private Integer phTourism;		   //旅游/摄影爱好者
    private Integer phHealth;		   //健身达人
    private Integer phFood;			   //美食达人
    private Integer phQuiet;		   //安静达人
    private Integer phSkill;		   //个人技能
    private Integer phCall;			   //电话
    private Integer phOpen;  		   //是否公开自己的合租信息给18的其他JDStar
	/*成员函数definition by lsl 2017/12/2*/
    public Integer getPh_id()
    {
    	return this.phId;
    }
    public void setPh_id(int phId)
    {
    	this.phId = phId;
    }
    public String getPh_name()
    {
    	return this.phName;
    }
    public void setPh_name(String phName)
    {
    	this.phName = phName;
    }
    public Integer getPh_sex()
    {
    	return this.phSex;
    }
    public void setPh_sex(int phSex)
    {
    	this.phSex = phSex;
    }
    public Integer getPh_timetag()
    {
    	return this.phTimetag;
    }
    public void setPh_timetag(int phTimetag)
    {
    	this.phTimetag = phTimetag;
    }
    public Integer getPh_area()
    {
    	return this.phArea;
    }
    public void setPh_area(int phArea)
    {
    	this.phArea = phArea;
    }
    public Integer getPh_diffsex()
    {
    	return this.phDiffsex;
    }
    public void setPh_diffsex(int phDiffsex)
    {
    	this.phDiffsex = phDiffsex;
    }
    public Integer getPh_single()
    {
    	return this.phSingle;
    }
    public void setPh_single(int phSingle)
    {
    	this.phSingle = phSingle;
    }
    public Integer getPh_sameroom()
    {
    	return this.phSameroom;
    }
    public void setPh_sameroom(int phSameroom)
    {
    	this.phSameroom = phSameroom;
    }
    public Integer getPh_subway()
    {
    	return this.phSubway;
    }
    public void setPh_subway(int phSubway)
    {
    	this.phSubway = phSubway;
    }
    public Integer getPh_ride()
    {
    	return this.phRide;
    }
    public void setPh_ride(int phRide)
    {
    	this.phRide = phRide;
    }
    public Integer getPh_price()
    {
    	return this.phPrice;
    }
    public void setPh_price(int phRide)
    {
    	this.phRide = phRide;
    }
    public Integer getPh_center()
    {
    	return this.phCenter;
    }
    public void setPh_center(int phCenter)
    {
    	this.phCenter = phCenter;
    }
    public Integer getPh_animal()
    {
    	return this.phAnimal;
    }
    public void setPh_animal(int phAnimal)
    {
    	this.phAnimal = phAnimal;
    }
    public Integer getPh_music()
    {
    	return this.phMusic;
    }
    public void setPh_music(int phMusic)
    {
    	this.phMusic = phMusic;
    }
    public Integer getPh_workstation()
    {
    	return this.phWorkstation;
    }
    public void setPh_workstation(int phWorkstation)
    {
    	this.phWorkstation = phWorkstation;
    }
    public Integer getPh_game()
    {
    	return this.phGame;
    }
    public void setPh_game(int phGame)
    {
    	this.phGame = phGame;
    }
    public Integer getPh_tablegame()
    {
    	return this.phTablegame;
    }
    public void setPh_tablegame(int phTablegame)
    {
    	this.phTablegame = phTablegame;
    }
    public Integer getPh_tourism()
    {
    	return this.phTourism;
    }
    public void setPh_toursim(int phTourism)
    {
    	this.phTourism = phTourism;
    }
    public Integer getPh_health()
    {
    	return this.phHealth;
    }
    public void setPh_health(int phHealth)
    {
    	this.phHealth = phHealth;
    }
    public Integer getPh_food()
    {
    	return this.phFood;
    }
    public void setPh_food(int phFood)
    {
    	this.phFood = phFood;
    }
    public Integer getPh_quiet()
    {
    	return this.phQuiet;
    }
    public void setPh_quiet(int phQuiet)
    {
    	this.phQuiet = phQuiet;
    }
    public Integer getPh_skill()
    {
    	return this.phSkill;
    }
    public void setPh_skill(int phSkill)
    {
    	this.phSkill = phSkill;
    }
    public Integer getPh_call()
    {
    	return this.phCall;
    }
    public void setPh_call(int phCall)
    {
    	this.phCall = phCall;
    }
    public Integer getPh_open()
    {
    	return this.phOpen;
    }
    public void setPh_open(int phOpen)
    {
    	this.phOpen = phOpen;
    }
    
}

