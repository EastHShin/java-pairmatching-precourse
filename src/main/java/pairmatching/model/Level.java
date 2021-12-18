package pairmatching.model;

import java.util.List;

public enum Level {
	LEVEL1("레벨1"),
	LEVEL2("레벨2"),
	LEVEL3("레벨3"),
	LEVEL4("레벨4"),
	LEVEL5("레벨5");

	private String name;
	private List<Mission> missions;

	Level(String name) {
		this.name = name;
	}

	// 추가 기능 구현

	public String getName() {
		return name;
	}

	public List<Mission> getMissions() {
		return missions;
	}

	public void missionInit(List<Mission> missions) {
		this.missions = missions;
	}

}
