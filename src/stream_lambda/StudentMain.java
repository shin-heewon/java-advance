package stream_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentMain {

  public static void main(String[] args) {
    //Arrays.toList() 이용하여 김종국,90 박수희,75  김지영,88 학생 객체를 저장하기

    List<Student> students = Arrays.asList(new Student("김종국", 90), new Student("박수희", 75), new Student("김지영", 88));

    //3명의 학생의 score 평균?
    //Student객체를 요소로 가지는 컬렉션(students)
    Stream<Student> studentStream = students.stream();

    //2. studentStream (중간처리) : 학생 객체를 점수(score) 즉 객체-점수로로 매핑,
    IntStream scoreStream = studentStream.mapToInt(Stu-> Stu.getScore());//scoreStream에는 점수인 90,75,88이 들어가 있다.

    //3. 최종 처리(평균 점수)
    double avg = scoreStream.average().getAsDouble();


    //각각의 파이프를 이어서 파이프라인 처리함
    double avg1 = students.stream().mapToInt(stu->stu.getScore()).average().getAsDouble();



    /*students에 저장되어 있는 학생들의 정보를 출렧해 주세요*/
    students.forEach(System.out::println);


  }

}
