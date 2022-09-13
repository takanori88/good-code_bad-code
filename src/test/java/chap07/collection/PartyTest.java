package chap07.collection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PartyTest {
    Member memberA = new Member(0, 100, 100);
    Member memberB = new Member(1, 100, 100);
    Member memberC = new Member(2, 100, 100);
    Member memberD = new Member(3, 100, 100);

    @Test
    void add() {
        Party party = new Party();
        Party newParty = party.add(memberA);
        assertThrows(RuntimeException.class, () -> newParty.add(memberA));
    }

    @Test
    void isAlive() {
        Party party = new Party();
        Party newParty = party.add(memberA);
        assertTrue(newParty.isAlive());
    }

    @Test
    void exists() {
        Party party = new Party();
        Party newParty = party.add(memberA);
        assertTrue(newParty.exists(memberA));
    }

    @Test
    void isFull() {
        Party party = new Party();
        Party party1 = party.add(memberA);
        Party party2 = party1.add(memberB);
        Party party3 = party2.add(memberC);
        Party party4 = party3.add(memberD);
        assertTrue(party4.isFull());
    }

    @Test
    void members() {
        Party party = new Party();
        Party party1 = party.add(memberA);
        Party party2 = party1.add(memberB);
        Party party3 = party2.add(memberC);
        Party party4 = party3.add(memberD);

        Member newMember = new Member(6, 100, 100);

        List<Member> members = party4.members();
        assertThrows(UnsupportedOperationException.class, () -> members.add(newMember));
    }
}