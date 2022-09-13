package chap07.collection;

import java.util.ArrayList;
import java.util.List;

public class Party {
    static final int MAX_MEMBER_COUNT = 4;
    private final List<Member> members;

    Party() {
        members = new ArrayList<Member>();
    }

    private Party(List<Member> members) {
        this.members = members;
    }

    Party add(final Member newMember) {
        if (exists(newMember)) {
            throw new RuntimeException("既にパーティに加わっています。");
        }

        if (isFull()) {
            throw new RuntimeException("これ以上メンバーを追加できません。");
        }

        final List<Member> adding = new ArrayList<>(members);
        adding.add(newMember);
        return new Party(adding);
    }

    boolean isAlive() {
        return members.stream().anyMatch(Member::isAlive);
    }

    boolean exists(final Member member) {
        return members.stream().anyMatch(each -> each.id == member.id);
    }

    boolean isFull() {
        return members.size() == MAX_MEMBER_COUNT;
    }

    List<Member> members() {
        return List.copyOf(members);
    }
}
