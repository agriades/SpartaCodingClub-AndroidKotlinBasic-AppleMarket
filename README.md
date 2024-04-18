# RecyclerView = Adapter + ViewHolder
## Adapter
---
### 필수과제 :  반드시 구현해야 할 기능
## 1️⃣ 메인 페이지 만들기

### RecyclerView : ⏳ RecyclerViewer를 이용해 리스트 화면을 만들어주세요.
- ✅ (뷰 바인딩으로 액티비티에 레이아웃 연결하기)
- ✅ 데이터 원본 준비하기: ForSale data class로 형식을 만들고, CurrentForSale class에 더미 데이터를 추가해 두었다.
- ✅ Adapter에 데이터 원본을 하나의 MutableList로 집어넣기.
- ✅ Adapter 안에 ViewHolder를 inner class로 만들기. 이 때, binding은 item의 xml layout과 연결할 것.
- 추가로 하면 좋을 것: forSale 1 ~ 10 데이터 구조 재활용 가능하게 만들기 (하드코딩 > 반복문, 배열)
---
#### companion object로 전역변수 선언

![image](https://github.com/agriades/SpartaCodingClub-AndroidKotlinBasic-AppleMarket/assets/75528131/0181764e-24ab-4148-b0a0-1943a111b97f)

배운 점: companion의 개념을 잘 몰랐는데, 아예 전역 변수로 쓰려면 companion object로 선언되어야 하나 보다.
CurrentForSale class 안에 companion object 구문을 만들어, forSale1 ~ 10 더미데이터를 안에 추가했다.

### 상품 선택: ⏳ Parcelize와 Intent를 통해 상세 페이지로 넘어가기
- [ ]  상품 선택시 아래 상품 상세 페이지로 이동합니다.
- [ ]  상품 상세페이지 이동시 intent로 객체를 전달합니다. (Parcelize 사용)

### 동적이지만 사소한 것들: ⏳ 다이얼로그, 알림, 콤마 처리
- [ ]  뒤로가기(BACK)버튼 클릭시 종료하시겠습니까? [확인][취소] 다이얼로그를 띄워주세요. (예시 비디오 참고)
- [ ]  상단 종모양 아이콘을 누르면 Notification을 생성해 주세요. (예시 비디오 참고)
- [ ]  상품 가격은 1000단위로 콤마(,) 처리해주세요.

--- 완료
### XML 레이아웃: ⏳ 디자인 및 화면 구성을 최대한 동일하게 해주세요. (사이즈 및 여백도 최대한 맞춰주세요.) ✨
- ✅  상품 데이터는 아래 dummy data 를 사용합니다. (더미 데이터는 자유롭게 추가 및 수정 가능)
- ✅❓  상단 툴바를 제거하고 풀스크린 화면으로 세팅해주세요.  (상태바(시간/배터리 표시하는 최상단바)는 남기고)
- ✅  상품 아이템들 사이에 회색 라인을 추가해서 구분해주세요.
- ✅  상품 이미지는 모서리를 라운드 처리해주세요.
- [ ]  상품 이름은 최대 두 줄이고, 그래도 넘어가면 뒷 부분에 …으로 처리해주세요.


💡 2️⃣ **상품 상세 페이지 만들기**

![image](https://github.com/agriades/SpartaCodingClub-AndroidKotlinBasic-AppleMarket/assets/75528131/b5a486ef-8002-44d7-b892-97bcf24a17e9)

- [ ]  디자인 및 화면 구성을 최대한 동일하게 해주세요. (사이즈 및 여백도 최대한 맞춰주세요.) ✨
- [ ]  메인화면에서 전달받은 데이터로 판매자, 주소, 아이템, 글내용, 가격등을 화면에 표시합니다.
- [ ]  하단 가격표시 레이아웃을 제외하고 전체화면은 스크롤이 되어야합니다. (예시 비디오 참고)
- [ ]  상단 < 버튼을 누르면 상세 화면은 종료되고 메인화면으로 돌아갑니다.
