# HW2-1_Spring_restful_practice
8/5(Fri.) 的[課堂作業](https://hackmd.io/@BillYang3416/H1XI72Ea9#%E8%AA%B2%E5%A0%82%E4%BD%9C%E6%A5%AD)，
建立 RESTful Web Service 專案，使用 Spring Boot RestController 及多種 Annotation，再到Postman操作專案。
Dependencies內增加Lombok，自動生成getter, setter 和 AllArgsConstructor。
<!-- ABOUT THE PROJECT -->
## About The Project

<img align="center" width="254" alt="structure" src="https://user-images.githubusercontent.com/80444687/183482981-4f535d8e-d07b-42cb-a039-6c73dbd5b0c2.png"> 
架構如上圖：

1.model:

* Meal的屬性 :arrow_right: name, price, description
* Order的屬性 :arrow_right: seq, waiter, mealList, totalPrice(隨著mealList，不放在建構子內)

2.OrderService:

* 建構子內寫入假資料用於測試。
* 有增刪改查共五種方法：取得所有訂單、根據ID取得訂單、新增訂單、修改訂單、刪除訂單
:round_pushpin:文件內的 getOrderById(int id) 改名為 getOrderBySeq(int seq) ，因為Order內的屬性為seq。

3.OrderController接收OrderService的方法，並使用多種 Mapping Annotation(GET, POST, PUT, DELETE)。


<!-- GETTING STARTED -->
## Getting Started

1.將此專案下載或clone後，在 IDE 打開 pom.xml。

2.開啟 Postman，import HW2.postman_collection.json

3.回到 IDE ，執行src/main/java/com.example.springrestfulpractice 內的 SpringRestfulPracticeApplication

4.至 Postman 操作此專案

<!-- CONTACT -->
## Contact

Huai Chiu - huaichiu@systex.com
