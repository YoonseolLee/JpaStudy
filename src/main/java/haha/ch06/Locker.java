package haha.ch06;

import javax.persistence.*;

/**
 * 일대일 단방향 - 주 테이블에 외래키
 * <p>
 * 일대일 양방향 - 주 테이블에 외래키
 */
//@Entity
//public class Locker {
//
//    @Id @GeneratedValue
//    @Column(name = "MEMBER_ID")
//    private Long id;
//
//    private String username;
//
//}
//
//@Entity
//class Member2 {
//    @Id @GeneratedValue
//    @Column(name = "LOCKER_ID")
//    private Long id;
//
//    private String name;

//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private Locker locker;
//
//}

/**
 * 일대일 양방향 - 주 테이블에 외래키
 */
//@Entity
//public class Locker {
//
//    @Id
//    @GeneratedValue
//    @Column(name = "MEMBER_ID")
//    private Long id;
//
//    private String username;
//
//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private Locker locker;
//}
//
//@Entity
//class Member2 {
//    @Id
//    @GeneratedValue
//    @Column(name = "LOCKER_ID")
//    private Long id;
//
//    private String name;
//
//    @OneToOne(mappedBy = "locker")
//    private Member2 member;
//}

/**
 * 일대일 양방향 - 대상 테이블에 외래키
 */

@Entity
public class Locker {
    @Id
    @GeneratedValue
    @Column(name = "LOCKER_ID")
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member2 member;
}

@Entity
class Member2 {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    @OneToOne(mappedBy = "member")
    private Locker locker;

}
