package com.google.bbqcoin.uri;

/**
 * <p>Exception to provide the following to {@link BbqcoinURI}:</p>
 * <ul>
 * <li>Provision of parsing error messages</li>
 * </ul>
 * <p>This base exception acts as a general failure mode not attributable to a specific cause (other than
 * that reported in the exception message). Since this is in English, it may not be worth reporting directly
 * to the user other than as part of a "general failure to parse" response.</p>
 *
 * @since 0.4.0
 */
public class BbqcoinURIParseException extends RuntimeException {
    public BbqcoinURIParseException(String s) {
        super(s);
    }

    public BbqcoinURIParseException(String s, Throwable throwable) {
        super(s, throwable);
    }
}
