package codes.matthem.auth;

public record AuthenticationRequest(
        String username,
        String password
) {
}
