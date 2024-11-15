# Schedule Develop

## API 명세서

### Schedule
| 기능       | Method | URL              | 상태코드                                       |
|----------|--------|-----------------|--------------------------------------------|
| 일정 생성    | POST   | /schedules       | 201:정상 등록, 400:잘못된 요청 메시지                  |
| 전체 일정 조회 | GET    | /schedules      | 200:정상 조회, 404:일정을 찾을 수 없음                 |
| 선택 일정 수정 | PATCH  | /schedules/{id} | 200:정상 수정, 400:잘못된 요청 메시지, 404: 일정 찾을 수 없음 |
| 일정 삭제    | DELETE | /schedules/{id}  | 204:정상 삭제, 400:잘못된 요청 메시지, 404: 일정 찾을 수 없음 |

***
### User
| 기능       | Method | URL         | 상태코드                                       |
|----------|-------|-------------|--------------------------------------------|
| 유저 생성    | POST | /users      | 201:정상 등록, 400:잘못된 요청 메시지                  |
| 전체 유저 조회 | GET   | /users      | 200:정상 조회, 404:유저를 찾을 수 없음                 |
| 유저 삭제    | DELETE | /users/{id} | 204:정상 삭제, 400:잘못된 요청 메시지, 404: 유저 찾을 수 없음 |

***
### ERD
![Alt text](/schedule_develop.png)
<img src="/Db.ERD.png" width="450px" height="300px" title="px(픽셀) 크기 설정" alt="RubberDuck"></img><br/>
***