package dk.sdu.mmmi.embedix.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalULSWIGLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_HEX_NUM=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__33=33;
    public static final int T__15=15;
    public static final int T__34=34;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalULSWIGLexer() {;} 
    public InternalULSWIGLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalULSWIGLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:11:7: ( 'READ' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:11:9: 'READ'
            {
            match("READ"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:12:7: ( 'WRITE' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:12:9: 'WRITE'
            {
            match("WRITE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:13:7: ( 'link' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:13:9: 'link'
            {
            match("link"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:14:7: ( ';' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:15:7: ( '.' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:16:7: ( '(' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:16:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:17:7: ( ')' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:17:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:18:7: ( '{' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:18:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:19:7: ( '}' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:20:7: ( ',' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:21:7: ( ':' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:22:7: ( '@' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:22:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:23:7: ( 'TOSNET' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:23:9: 'TOSNET'
            {
            match("TOSNET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:24:7: ( 'CTRL' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:24:9: 'CTRL'
            {
            match("CTRL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:25:7: ( '=' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:25:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:26:7: ( 'BASE' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:26:9: 'BASE'
            {
            match("BASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:27:7: ( 'UART' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:27:9: 'UART'
            {
            match("UART"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:28:7: ( '+' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:28:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:29:7: ( 'ID' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:29:9: 'ID'
            {
            match("ID"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:30:7: ( 'CRC' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:30:9: 'CRC'
            {
            match("CRC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:31:7: ( 'PUBLISH' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:31:9: 'PUBLISH'
            {
            match("PUBLISH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:32:7: ( 'ALL' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:32:9: 'ALL'
            {
            match("ALL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:33:7: ( 'public' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:33:9: 'public'
            {
            match("public"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_HEX_NUM"
    public final void mRULE_HEX_NUM() throws RecognitionException {
        try {
            int _type = RULE_HEX_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5953:14: ( '0' 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5953:16: '0' 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            {
            match('0'); 
            match('x'); 
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5953:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='F')||(LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_NUM"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5955:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5955:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5955:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5955:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5955:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5957:10: ( ( '0' .. '9' )+ )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5957:12: ( '0' .. '9' )+
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5957:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5957:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5959:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5961:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5961:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5961:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5961:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:41: ( '\\r' )? '\\n'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5963:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5965:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5965:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5965:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5967:16: ( . )
            // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:5967:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_HEX_NUM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=31;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:148: RULE_HEX_NUM
                {
                mRULE_HEX_NUM(); 

                }
                break;
            case 25 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:161: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 26 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:169: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 27 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:178: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 28 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:190: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 29 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:206: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 30 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:222: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 31 :
                // ../unityLinkSoftwareInterfaceGenerator.ui/src-gen/dk/sdu/mmmi/embedix/ui/contentassist/antlr/internal/InternalULSWIG.g:1:230: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\3\41\11\uffff\2\41\1\uffff\2\41\1\uffff\4\41\1\71\1\37"+
        "\2\uffff\3\37\2\uffff\1\41\1\uffff\2\41\11\uffff\3\41\1\uffff\2"+
        "\41\1\uffff\1\106\3\41\6\uffff\5\41\1\117\2\41\1\uffff\1\41\1\123"+
        "\1\41\1\125\1\41\1\127\1\41\1\131\1\uffff\1\132\1\133\1\41\1\uffff"+
        "\1\41\1\uffff\1\136\1\uffff\1\41\3\uffff\2\41\1\uffff\1\142\1\41"+
        "\1\144\1\uffff\1\145\2\uffff";
    static final String DFA13_eofS =
        "\146\uffff";
    static final String DFA13_minS =
        "\1\0\1\105\1\122\1\151\11\uffff\1\117\1\122\1\uffff\2\101\1\uffff"+
        "\1\104\1\125\1\114\1\165\1\170\1\101\2\uffff\2\0\1\52\2\uffff\1"+
        "\101\1\uffff\1\111\1\156\11\uffff\1\123\1\122\1\103\1\uffff\1\123"+
        "\1\122\1\uffff\1\60\1\102\1\114\1\142\6\uffff\1\104\1\124\1\153"+
        "\1\116\1\114\1\60\1\105\1\124\1\uffff\1\114\1\60\1\154\1\60\1\105"+
        "\1\60\1\105\1\60\1\uffff\2\60\1\111\1\uffff\1\151\1\uffff\1\60\1"+
        "\uffff\1\124\3\uffff\1\123\1\143\1\uffff\1\60\1\110\1\60\1\uffff"+
        "\1\60\2\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\105\1\122\1\151\11\uffff\1\117\1\124\1\uffff\2\101\1"+
        "\uffff\1\104\1\125\1\114\1\165\1\170\1\172\2\uffff\2\uffff\1\57"+
        "\2\uffff\1\101\1\uffff\1\111\1\156\11\uffff\1\123\1\122\1\103\1"+
        "\uffff\1\123\1\122\1\uffff\1\172\1\102\1\114\1\142\6\uffff\1\104"+
        "\1\124\1\153\1\116\1\114\1\172\1\105\1\124\1\uffff\1\114\1\172\1"+
        "\154\1\172\1\105\1\172\1\105\1\172\1\uffff\2\172\1\111\1\uffff\1"+
        "\151\1\uffff\1\172\1\uffff\1\124\3\uffff\1\123\1\143\1\uffff\1\172"+
        "\1\110\1\172\1\uffff\1\172\2\uffff";
    static final String DFA13_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\17\2"+
        "\uffff\1\22\6\uffff\1\31\1\32\3\uffff\1\36\1\37\1\uffff\1\31\2\uffff"+
        "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\3\uffff\1\17\2\uffff\1"+
        "\22\4\uffff\1\30\1\32\1\33\1\34\1\35\1\36\10\uffff\1\23\10\uffff"+
        "\1\24\3\uffff\1\26\1\uffff\1\1\1\uffff\1\3\1\uffff\1\16\1\20\1\21"+
        "\2\uffff\1\2\3\uffff\1\15\1\uffff\1\27\1\25";
    static final String DFA13_specialS =
        "\1\1\32\uffff\1\0\1\2\111\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\1\6\1\7"+
            "\1\37\1\22\1\12\1\37\1\5\1\35\1\27\11\32\1\13\1\4\1\37\1\17"+
            "\2\37\1\14\1\25\1\20\1\16\5\31\1\23\6\31\1\24\1\31\1\1\1\31"+
            "\1\15\1\21\1\31\1\2\3\31\3\37\1\30\1\31\1\37\13\31\1\3\3\31"+
            "\1\26\12\31\1\10\1\37\1\11\uff82\37",
            "\1\40",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\57\1\uffff\1\56",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "",
            "\0\72",
            "\0\72",
            "\1\73\4\uffff\1\74",
            "",
            "",
            "\1\76",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\120",
            "\1\121",
            "",
            "\1\122",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\124",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\126",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\130",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\134",
            "",
            "\1\135",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\1\137",
            "",
            "",
            "",
            "\1\140",
            "\1\141",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "\1\143",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\4\uffff\1\41\1\uffff\32\41",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_HEX_NUM | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_27 = input.LA(1);

                        s = -1;
                        if ( ((LA13_27>='\u0000' && LA13_27<='\uFFFF')) ) {s = 58;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='R') ) {s = 1;}

                        else if ( (LA13_0=='W') ) {s = 2;}

                        else if ( (LA13_0=='l') ) {s = 3;}

                        else if ( (LA13_0==';') ) {s = 4;}

                        else if ( (LA13_0=='.') ) {s = 5;}

                        else if ( (LA13_0=='(') ) {s = 6;}

                        else if ( (LA13_0==')') ) {s = 7;}

                        else if ( (LA13_0=='{') ) {s = 8;}

                        else if ( (LA13_0=='}') ) {s = 9;}

                        else if ( (LA13_0==',') ) {s = 10;}

                        else if ( (LA13_0==':') ) {s = 11;}

                        else if ( (LA13_0=='@') ) {s = 12;}

                        else if ( (LA13_0=='T') ) {s = 13;}

                        else if ( (LA13_0=='C') ) {s = 14;}

                        else if ( (LA13_0=='=') ) {s = 15;}

                        else if ( (LA13_0=='B') ) {s = 16;}

                        else if ( (LA13_0=='U') ) {s = 17;}

                        else if ( (LA13_0=='+') ) {s = 18;}

                        else if ( (LA13_0=='I') ) {s = 19;}

                        else if ( (LA13_0=='P') ) {s = 20;}

                        else if ( (LA13_0=='A') ) {s = 21;}

                        else if ( (LA13_0=='p') ) {s = 22;}

                        else if ( (LA13_0=='0') ) {s = 23;}

                        else if ( (LA13_0=='^') ) {s = 24;}

                        else if ( ((LA13_0>='D' && LA13_0<='H')||(LA13_0>='J' && LA13_0<='O')||LA13_0=='Q'||LA13_0=='S'||LA13_0=='V'||(LA13_0>='X' && LA13_0<='Z')||LA13_0=='_'||(LA13_0>='a' && LA13_0<='k')||(LA13_0>='m' && LA13_0<='o')||(LA13_0>='q' && LA13_0<='z')) ) {s = 25;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 26;}

                        else if ( (LA13_0=='\"') ) {s = 27;}

                        else if ( (LA13_0=='\'') ) {s = 28;}

                        else if ( (LA13_0=='/') ) {s = 29;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 30;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='&')||LA13_0=='*'||LA13_0=='-'||LA13_0=='<'||(LA13_0>='>' && LA13_0<='?')||(LA13_0>='[' && LA13_0<=']')||LA13_0=='`'||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_28 = input.LA(1);

                        s = -1;
                        if ( ((LA13_28>='\u0000' && LA13_28<='\uFFFF')) ) {s = 58;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}