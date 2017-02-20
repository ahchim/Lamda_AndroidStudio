package com.onegravity.lambda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        /*
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(view.getId());
            }
        });
        */

        // 람다를 사용하는 이유
        // 1. 코드량을 줄일 수 있다

        // 람다 사용조건
        // 1. 콜백 객체가 인자로 넘어가는 곳
        // 2. 콜백 객체에 함수가 하나여야 한다

        // 람다 작성법
        // 1. 콜백객체에서 하나의 함수에 있는 로직블럭만 사용된다.
        // 2. 함수명은 생략하고 괄호와 인자(타입생략)만 표시한다.
        // 3. 함수명과 로직블럭을 -> 표시로 연결한다.
        //btn.setOnClickListener( (View view) -> { System.out.println(view.getId()); });
        btn.setOnClickListener( (view) -> { System.out.println(view.getId()); });
        //btn.setOnClickListener( view -> System.out.println(view.getId()) );
        //btn.setOnClickListener( System.out::println );  // 로그로 하고싶었는데 아쉽꾸만


        //Thread th = new Thread(() -> { System.out.println("Thread Run!"); } );

        //th.start();
    }

    // 람다언어의 사용 ex) (view) -> { System.out.println(view.getId()); }
    // 하나의 함수 instance로 작성
    /* 함수를 개체화한다.
    함수이름 생략 / (파라미터타입 생략) -> {
        실행블럭
    }
    */
}
