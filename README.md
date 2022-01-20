# Study-Kotlin-Basic
Kotlin의 기본적인 문법에 대해서 공부합니다.

## Why Using Kotlin?
코틀린은 IntelliJ IDEA의 개발사 JetBrains에서 2011년에 공개한 오픈 소스 프로그래밍 언어입니다.  
[JVM](https://d2.naver.com/helloworld/1230) 기반의 언어이며, Java와 유사하지만 더 간결한 문법과 다양한 기능을 추가하였습니다.  
Java와의 상호 운용이 100% 지원됩니다. JVM 바이트코드가 기본이지만, Kotlin/Native 컴파일러를 사용하여 기계어로 컴파일할 수 있으며 안드로이드, 스프링 프레임워크, 톰캣, JavaScript, Java EE, HTML5, iOS, 라즈베리 파이 등을 개발할 때 사용할 수 있습니다.  
[카카오 톡메시징 파트 유용하 - 카카오톡의 서버 사이드 코틀린](https://tv.kakao.com/channel/3150758/cliplink/391419295)의 영상을 보시면 카카오톡에서 어떻게 코틀린을 사용할 수 있는지에 대해서 조금 알 수 있게 됩니다.

## How Installation Kotlin
**Based on macOS:**
```shell
$ brew install openjdk
$ brew install kotlin
```

## Studied
- `var`: 일반적으로 통용되는 변수, 언제든지 읽기, 쓰기가 가능함. (변수)
- `val`: 선언시에만 초기화 가능, 중간 값을 변경할 수 없음. (상수)
  - runtime 시 변경되 말아야 할 값은 안전하게 `val`로 선언하는 것이 좋음.
- 변수는 선언 위치에 따라서 두 가지 이름으로 불리게 됨.
  - **클래스에 선언된 변수:** `Property`(속성)
  - **이 외의 Scope 내 선언된 변수:** `Local Variable` (로컬변수)
- **코틀린이 고전적인 언어와 다른점**
  - variable 'a' must be initialized
    - 고전적인 언어인 경우에는 변수가 선언된 후 초기화 되지 않으면 기본값으로 초기화 되거나 값이 활당되지 않았다는 표시로 `nil` 가지게 됨.
    - 코틀린은 기본 변수에서 `nil`을 허용하지 않으며 또한 변에 값을 할당하지 않은 채로 사용하게 되면 문법 에러로 표시하고 컴파일을 막아주게 되며 의도되지 않은 동작이나 [null pointer exception](https://ko.myservername.com/what-is-nullpointerexception-java-how-avoid-it) 등을 원천적으로 차단해 준다는 장점이 있음.
- [**Basic types**](https://kotlinlang.org/docs/basic-types.html): 자바의 호환성 문제를 없애기 위해서 자바와 똑같은 타입을 쓰고 있음.

## Study Source
### Blog & Documents
- [Kotlin docs v1.6.10](https://kotlinlang.org/docs/home.html)

### Videos
- [새차원의 코틀린(Kotlin) 강좌](https://www.inflearn.com/course/%EC%BD%94%ED%8B%80%EB%A6%B0-%EA%B0%95%EC%A2%8C-%EC%83%88%EC%B0%A8%EC%9B%90)
- [디모의 Kotlin 강좌](https://www.youtube.com/watch?v=8RIsukgeUVw&list=PLQdnHjXZyYadiw5aV3p6DwUdXV2bZuhlN&index=1)