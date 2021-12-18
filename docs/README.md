# 페어매칭관리 애플리케이션

---

## 기능 구현 목록

### 0. 초기화
- 크루 정보를 읽어들여 리스트에 저장하는 기능 구현
- 과정,레벨,미션 정보를 저장
- 과정, 레벨, 미션을 입력받는 기능 구현
### 1.페어 매칭
- 크루 목록의 순서를 랜덤으로 섞는 기능 구현
- 홀수인 경우 마지막 남은 크루는 마지막 페어에 포함하는 기능 구현
- 같은 레벨에서 이미 페어로 만난적이 있는 크루끼리 다시 매칭되면 다시 섞는 기능 구현
- 3회 시도까지 매칭되지 않으면 에러메시지 출력하는 기능 구현
- 매칭될 수 있는 경우의 수가 없으면 에러메시지 출력하는 기능 구현
- 매칭 정보를 저장하는 기능 구현
- 미션이 없는 레벨을 선택하면 에러메시지 출력하는 기능 구현

### 2. 페어 조회
- 페어를 조회하는 기능 구현
- 과정, 레벨, 미션을 입력받아 일치하는 정보에 맞는 매칭 결과를 출력하는 기능 구현

### 3. 페어 초기화
- 페어를 초기화하는 기능 구현