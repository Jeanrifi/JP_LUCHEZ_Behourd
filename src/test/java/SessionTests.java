import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SessionTests {

    @Test
    @DisplayName("Etant donné une session avec au moins 2 joueurs," +
            "Quand la partie démarre," +
            "Alors il faut uniquement 2 équipes avec des joueurs différents.")
    void shouldCheckNumberOfTeamsAndNotSamePlayers_whenGameStart() {
        // Given
        Session session = new Session(new Player(), new Player());

        // When
        Game game = session.GameStart();

        // Then
        Teams[] teams = game.teams;
        assertThat(teams.size() == 2).isTrue();
        assertThat(teams.Team1().Players).isIn(teams.Team2().Players);

    }

}
