package dk.sdu.mmmi.embedix.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.embedix.services.ULSWIGGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalULSWIGParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_HEX_NUM", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'('", "','", "')'", "':'", "'{'", "'}'", "'@'", "'TOSNET'", "';'", "'LINK'", "'='", "'BASE'", "'+'", "'READ'", "'WRITE'", "'ID'", "'CRC'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_HEX_NUM=6;
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
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__19=19;
    public static final int RULE_STRING=7;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalULSWIGParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalULSWIGParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalULSWIGParser.tokenNames; }
    public String getGrammarFileName() { return "../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g"; }



     	private ULSWIGGrammarAccess grammarAccess;
     	
        public InternalULSWIGParser(TokenStream input, ULSWIGGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Robot";	
       	}
       	
       	@Override
       	protected ULSWIGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRobot"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:67:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:68:2: (iv_ruleRobot= ruleRobot EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:69:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_ruleRobot_in_entryRuleRobot75);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRobot85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:76:1: ruleRobot returns [EObject current=null] : ( (lv_constructors_0_0= ruleConstructor ) )* ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        EObject lv_constructors_0_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:79:28: ( ( (lv_constructors_0_0= ruleConstructor ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: ( (lv_constructors_0_0= ruleConstructor ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: ( (lv_constructors_0_0= ruleConstructor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:81:1: (lv_constructors_0_0= ruleConstructor )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:81:1: (lv_constructors_0_0= ruleConstructor )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:82:3: lv_constructors_0_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRobotAccess().getConstructorsConstructorParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleRobot130);
            	    lv_constructors_0_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRobotRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_0_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:106:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:108:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor166);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:115:1: ruleConstructor returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( (lv_members_12_0= ruleMember ) )* otherlv_13= '}' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token lv_isPublic_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_parameters_3_0=null;
        Token otherlv_4=null;
        Token lv_parameters_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_addresses_8_0 = null;

        EObject lv_addresses_10_0 = null;

        EObject lv_members_12_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:118:28: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( (lv_members_12_0= ruleMember ) )* otherlv_13= '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( (lv_members_12_0= ruleMember ) )* otherlv_13= '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( (lv_members_12_0= ruleMember ) )* otherlv_13= '}' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:2: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( (lv_members_12_0= ruleMember ) )* otherlv_13= '}'
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:2: ( (lv_isPublic_0_0= 'public' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:120:1: (lv_isPublic_0_0= 'public' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:120:1: (lv_isPublic_0_0= 'public' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:121:3: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,12,FOLLOW_12_in_ruleConstructor219); 

                            newLeafNode(lv_isPublic_0_0, grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(current, "isPublic", true, "public");
                    	    

                    }


                    }
                    break;

            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:134:3: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:135:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:135:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:136:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor250); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConstructorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstructorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleConstructor267); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:156:1: ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:156:2: ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:156:2: ( (lv_parameters_3_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:157:1: (lv_parameters_3_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:157:1: (lv_parameters_3_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:158:3: lv_parameters_3_0= RULE_ID
                    {
                    lv_parameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor285); 

                    			newLeafNode(lv_parameters_3_0, grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"parameters",
                            		lv_parameters_3_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:174:2: (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:174:4: otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleConstructor303); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:178:1: ( (lv_parameters_5_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:179:1: (lv_parameters_5_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:179:1: (lv_parameters_5_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:180:3: lv_parameters_5_0= RULE_ID
                    	    {
                    	    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor320); 

                    	    			newLeafNode(lv_parameters_5_0, grammarAccess.getConstructorAccess().getParametersIDTerminalRuleCall_3_1_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_5_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleConstructor341); 

                	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:200:1: (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:200:3: otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )*
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleConstructor354); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getColonKeyword_5_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:204:1: ( (lv_addresses_8_0= ruleAddress ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_addresses_8_0= ruleAddress )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_addresses_8_0= ruleAddress )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:206:3: lv_addresses_8_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getAddressesAddressParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleConstructor375);
                    lv_addresses_8_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		add(
                           			current, 
                           			"addresses",
                            		lv_addresses_8_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:222:2: (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:222:4: otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleConstructor388); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:226:1: ( (lv_addresses_10_0= ruleAddress ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:227:1: (lv_addresses_10_0= ruleAddress )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:227:1: (lv_addresses_10_0= ruleAddress )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:228:3: lv_addresses_10_0= ruleAddress
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstructorAccess().getAddressesAddressParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddress_in_ruleConstructor409);
                    	    lv_addresses_10_0=ruleAddress();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"addresses",
                    	            		lv_addresses_10_0, 
                    	            		"Address");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleConstructor425); 

                	newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:1: ( (lv_members_12_0= ruleMember ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=19 && LA7_0<=20)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:249:1: (lv_members_12_0= ruleMember )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:249:1: (lv_members_12_0= ruleMember )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:250:3: lv_members_12_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleConstructor446);
            	    lv_members_12_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_12_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleConstructor459); 

                	newLeafNode(otherlv_13, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleAddress"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:278:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:279:2: (iv_ruleAddress= ruleAddress EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:280:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress495);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress505); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:287:1: ruleAddress returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;
        Token lv_elements_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:290:28: ( ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:291:1: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:291:1: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==13) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:291:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:291:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:291:4: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAddress543); 

                        	newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getCommercialAtKeyword_0_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:296:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:296:1: (lv_name_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:297:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress560); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getAddressAccess().getNameIDTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAddressRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:314:6: (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:314:6: (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:314:8: otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAddress585); 

                        	newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getCommercialAtKeyword_1_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAddress597); 

                        	newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:322:1: ( (lv_elements_4_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:323:1: (lv_elements_4_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:323:1: (lv_elements_4_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:324:3: lv_elements_4_0= RULE_ID
                    {
                    lv_elements_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress614); 

                    			newLeafNode(lv_elements_4_0, grammarAccess.getAddressAccess().getElementsIDTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAddressRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"elements",
                            		lv_elements_4_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:340:2: (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:340:4: otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAddress632); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:1: ( (lv_elements_6_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:345:1: (lv_elements_6_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:345:1: (lv_elements_6_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:346:3: lv_elements_6_0= RULE_ID
                    	    {
                    	    lv_elements_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress649); 

                    	    			newLeafNode(lv_elements_6_0, grammarAccess.getAddressAccess().getElementsIDTerminalRuleCall_1_3_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAddressRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_6_0, 
                    	            		"ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleAddress668); 

                        	newLeafNode(otherlv_7, grammarAccess.getAddressAccess().getRightParenthesisKeyword_1_4());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRuleMember"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:374:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:375:2: (iv_ruleMember= ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:376:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember705);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:383:1: ruleMember returns [EObject current=null] : (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_LinkBinding_0 = null;

        EObject this_Expansion_1 = null;

        EObject this_Instantiation_2 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:386:28: ( (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:387:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:387:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==RULE_ID) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==16) ) {
                        int LA10_5 = input.LA(4);

                        if ( ((LA10_5>=26 && LA10_5<=27)) ) {
                            alt10=3;
                        }
                        else if ( (LA10_5==RULE_ID) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 5, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:388:5: this_LinkBinding_0= ruleLinkBinding
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinkBinding_in_ruleMember762);
                    this_LinkBinding_0=ruleLinkBinding();

                    state._fsp--;

                     
                            current = this_LinkBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:398:5: this_Expansion_1= ruleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpansion_in_ruleMember789);
                    this_Expansion_1=ruleExpansion();

                    state._fsp--;

                     
                            current = this_Expansion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:408:5: this_Instantiation_2= ruleInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleMember816);
                    this_Instantiation_2=ruleInstantiation();

                    state._fsp--;

                     
                            current = this_Instantiation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:424:1: entryRuleLinkBinding returns [EObject current=null] : iv_ruleLinkBinding= ruleLinkBinding EOF ;
    public final EObject entryRuleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:425:2: (iv_ruleLinkBinding= ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:426:2: iv_ruleLinkBinding= ruleLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding851);
            iv_ruleLinkBinding=ruleLinkBinding();

            state._fsp--;

             current =iv_ruleLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding861); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkBinding"


    // $ANTLR start "ruleLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:433:1: ruleLinkBinding returns [EObject current=null] : (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleLinkBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:436:28: ( (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:437:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:437:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' otherlv_6= ';' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:437:3: otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleLinkBinding898); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkBindingAccess().getTOSNETKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleLinkBinding910); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkBindingAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:445:1: ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:445:2: ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:445:2: ( (lv_properties_2_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:446:1: (lv_properties_2_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:446:1: (lv_properties_2_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:447:3: lv_properties_2_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleLinkBinding932);
            lv_properties_2_0=ruleLinkProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkBindingRule());
            	        }
                   		add(
                   			current, 
                   			"properties",
                    		lv_properties_2_0, 
                    		"LinkProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:463:2: (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:463:4: otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) )
            {
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleLinkBinding945); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkBindingAccess().getCommaKeyword_2_1_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:467:1: ( (lv_properties_4_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:468:1: (lv_properties_4_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:468:1: (lv_properties_4_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:469:3: lv_properties_4_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleLinkBinding966);
            lv_properties_4_0=ruleLinkProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLinkBindingRule());
            	        }
                   		add(
                   			current, 
                   			"properties",
                    		lv_properties_4_0, 
                    		"LinkProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLinkBinding980); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkBindingAccess().getRightParenthesisKeyword_3());
                
            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleLinkBinding992); 

                	newLeafNode(otherlv_6, grammarAccess.getLinkBindingAccess().getSemicolonKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkBinding"


    // $ANTLR start "entryRuleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:501:1: entryRuleLinkProperty returns [EObject current=null] : iv_ruleLinkProperty= ruleLinkProperty EOF ;
    public final EObject entryRuleLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:502:2: (iv_ruleLinkProperty= ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:503:2: iv_ruleLinkProperty= ruleLinkProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1028);
            iv_ruleLinkProperty=ruleLinkProperty();

            state._fsp--;

             current =iv_ruleLinkProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty1038); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkProperty"


    // $ANTLR start "ruleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:510:1: ruleLinkProperty returns [EObject current=null] : ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) ) ;
    public final EObject ruleLinkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_linkName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_baseValue_5_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:513:28: ( ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:514:1: ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:514:1: ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:514:2: (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:514:2: (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:514:4: otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLinkProperty1076); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinkPropertyAccess().getLINKKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLinkProperty1088); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:522:1: ( (lv_linkName_2_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:523:1: (lv_linkName_2_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:523:1: (lv_linkName_2_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:3: lv_linkName_2_0= RULE_ID
                    {
                    lv_linkName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1105); 

                    			newLeafNode(lv_linkName_2_0, grammarAccess.getLinkPropertyAccess().getLinkNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"linkName",
                            		lv_linkName_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:541:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:541:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:541:8: otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1130); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleLinkProperty1142); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:549:1: ( (lv_baseValue_5_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:550:1: (lv_baseValue_5_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:550:1: (lv_baseValue_5_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:551:3: lv_baseValue_5_0= RULE_INT
                    {
                    lv_baseValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLinkProperty1159); 

                    			newLeafNode(lv_baseValue_5_0, grammarAccess.getLinkPropertyAccess().getBaseValueINTTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"baseValue",
                            		lv_baseValue_5_0, 
                            		"INT");
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkProperty"


    // $ANTLR start "entryRuleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:575:1: entryRuleExpansion returns [EObject current=null] : iv_ruleExpansion= ruleExpansion EOF ;
    public final EObject entryRuleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:576:2: (iv_ruleExpansion= ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:577:2: iv_ruleExpansion= ruleExpansion EOF
            {
             newCompositeNode(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion1201);
            iv_ruleExpansion=ruleExpansion();

            state._fsp--;

             current =iv_ruleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion1211); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpansion"


    // $ANTLR start "ruleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:584:1: ruleExpansion returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? otherlv_11= ';' ) ;
    public final EObject ruleExpansion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_bindings_8_0 = null;

        EObject lv_bindings_10_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:587:28: ( ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? otherlv_11= ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:588:1: ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? otherlv_11= ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:588:1: ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? otherlv_11= ';' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:588:2: ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? otherlv_11= ';'
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:588:2: ( (lv_identifier_0_0= ruleExpansionName ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:589:1: (lv_identifier_0_0= ruleExpansionName )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:589:1: (lv_identifier_0_0= ruleExpansionName )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:590:3: lv_identifier_0_0= ruleExpansionName
            {
             
            	        newCompositeNode(grammarAccess.getExpansionAccess().getIdentifierExpansionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpansionName_in_ruleExpansion1257);
            lv_identifier_0_0=ruleExpansionName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExpansionRule());
            	        }
                   		set(
                   			current, 
                   			"identifier",
                    		lv_identifier_0_0, 
                    		"ExpansionName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExpansion1269); 

                	newLeafNode(otherlv_1, grammarAccess.getExpansionAccess().getColonKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:610:1: ( (otherlv_2= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:611:1: (otherlv_2= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:611:1: (otherlv_2= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:612:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpansionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpansion1289); 

            		newLeafNode(otherlv_2, grammarAccess.getExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleExpansion1301); 

                	newLeafNode(otherlv_3, grammarAccess.getExpansionAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:627:1: ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:627:2: ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:627:2: ( (lv_arguments_4_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:628:1: (lv_arguments_4_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:628:1: (lv_arguments_4_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:629:3: lv_arguments_4_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleExpansion1323);
                    lv_arguments_4_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:645:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:645:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleExpansion1336); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getExpansionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:649:1: ( (lv_arguments_6_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:650:1: (lv_arguments_6_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:650:1: (lv_arguments_6_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:651:3: lv_arguments_6_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleExpansion1357);
                    	    lv_arguments_6_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExpansionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_6_0, 
                    	            		"Argument");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleExpansion1373); 

                	newLeafNode(otherlv_7, grammarAccess.getExpansionAccess().getRightParenthesisKeyword_5());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:671:1: ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:671:2: ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:671:2: ( (lv_bindings_8_0= ruleAddressBinding ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:672:1: (lv_bindings_8_0= ruleAddressBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:672:1: (lv_bindings_8_0= ruleAddressBinding )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:673:3: lv_bindings_8_0= ruleAddressBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddressBinding_in_ruleExpansion1395);
                    lv_bindings_8_0=ruleAddressBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"bindings",
                            		lv_bindings_8_0, 
                            		"AddressBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:689:2: (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:689:4: otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleExpansion1408); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getExpansionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:693:1: ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:694:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:694:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:695:3: lv_bindings_10_0= ruleAddressBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddressBinding_in_ruleExpansion1429);
                    	    lv_bindings_10_0=ruleAddressBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getExpansionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bindings",
                    	            		lv_bindings_10_0, 
                    	            		"AddressBinding");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleExpansion1445); 

                	newLeafNode(otherlv_11, grammarAccess.getExpansionAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpansion"


    // $ANTLR start "entryRuleExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:723:1: entryRuleExpansionName returns [EObject current=null] : iv_ruleExpansionName= ruleExpansionName EOF ;
    public final EObject entryRuleExpansionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansionName = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:724:2: (iv_ruleExpansionName= ruleExpansionName EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:725:2: iv_ruleExpansionName= ruleExpansionName EOF
            {
             newCompositeNode(grammarAccess.getExpansionNameRule()); 
            pushFollow(FOLLOW_ruleExpansionName_in_entryRuleExpansionName1481);
            iv_ruleExpansionName=ruleExpansionName();

            state._fsp--;

             current =iv_ruleExpansionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansionName1491); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpansionName"


    // $ANTLR start "ruleExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:732:1: ruleExpansionName returns [EObject current=null] : (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName ) ;
    public final EObject ruleExpansionName() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpansionName_0 = null;

        EObject this_AddressExpansionName_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:735:28: ( (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:736:1: (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:736:1: (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==19) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:737:5: this_SimpleExpansionName_0= ruleSimpleExpansionName
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionNameAccess().getSimpleExpansionNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleExpansionName_in_ruleExpansionName1538);
                    this_SimpleExpansionName_0=ruleSimpleExpansionName();

                    state._fsp--;

                     
                            current = this_SimpleExpansionName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:747:5: this_AddressExpansionName_1= ruleAddressExpansionName
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionNameAccess().getAddressExpansionNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressExpansionName_in_ruleExpansionName1565);
                    this_AddressExpansionName_1=ruleAddressExpansionName();

                    state._fsp--;

                     
                            current = this_AddressExpansionName_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpansionName"


    // $ANTLR start "entryRuleAddressExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:763:1: entryRuleAddressExpansionName returns [EObject current=null] : iv_ruleAddressExpansionName= ruleAddressExpansionName EOF ;
    public final EObject entryRuleAddressExpansionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressExpansionName = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:764:2: (iv_ruleAddressExpansionName= ruleAddressExpansionName EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:765:2: iv_ruleAddressExpansionName= ruleAddressExpansionName EOF
            {
             newCompositeNode(grammarAccess.getAddressExpansionNameRule()); 
            pushFollow(FOLLOW_ruleAddressExpansionName_in_entryRuleAddressExpansionName1600);
            iv_ruleAddressExpansionName=ruleAddressExpansionName();

            state._fsp--;

             current =iv_ruleAddressExpansionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansionName1610); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressExpansionName"


    // $ANTLR start "ruleAddressExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:772:1: ruleAddressExpansionName returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAddressExpansionName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:775:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:776:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:776:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:776:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAddressExpansionName1647); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressExpansionNameAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:780:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:781:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:781:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:782:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansionName1664); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAddressExpansionNameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressExpansionNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressExpansionName"


    // $ANTLR start "entryRuleSimpleExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:806:1: entryRuleSimpleExpansionName returns [EObject current=null] : iv_ruleSimpleExpansionName= ruleSimpleExpansionName EOF ;
    public final EObject entryRuleSimpleExpansionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpansionName = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:807:2: (iv_ruleSimpleExpansionName= ruleSimpleExpansionName EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:808:2: iv_ruleSimpleExpansionName= ruleSimpleExpansionName EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpansionNameRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansionName_in_entryRuleSimpleExpansionName1705);
            iv_ruleSimpleExpansionName=ruleSimpleExpansionName();

            state._fsp--;

             current =iv_ruleSimpleExpansionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansionName1715); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleExpansionName"


    // $ANTLR start "ruleSimpleExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:815:1: ruleSimpleExpansionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleExpansionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:818:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:819:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:819:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:820:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:820:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:821:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansionName1756); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleExpansionNameAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleExpansionNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleExpansionName"


    // $ANTLR start "entryRuleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:845:1: entryRuleAddressBinding returns [EObject current=null] : iv_ruleAddressBinding= ruleAddressBinding EOF ;
    public final EObject entryRuleAddressBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:846:2: (iv_ruleAddressBinding= ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:847:2: iv_ruleAddressBinding= ruleAddressBinding EOF
            {
             newCompositeNode(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding1796);
            iv_ruleAddressBinding=ruleAddressBinding();

            state._fsp--;

             current =iv_ruleAddressBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding1806); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddressBinding"


    // $ANTLR start "ruleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:854:1: ruleAddressBinding returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleAddressBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_addresses_4_0=null;
        Token otherlv_5=null;
        Token lv_addresses_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:857:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:858:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:858:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:858:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleAddressBinding1843); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:862:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:863:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:863:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressBinding1860); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressBindingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAddressBinding1877); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAddressBinding1889); 

                	newLeafNode(otherlv_3, grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:888:1: ( (lv_addresses_4_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:889:1: (lv_addresses_4_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:889:1: (lv_addresses_4_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:890:3: lv_addresses_4_0= RULE_HEX_NUM
            {
            lv_addresses_4_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding1906); 

            			newLeafNode(lv_addresses_4_0, grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressBindingRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"addresses",
                    		lv_addresses_4_0, 
                    		"HEX_NUM");
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:906:2: (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==14) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:906:4: otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAddressBinding1924); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAddressBindingAccess().getCommaKeyword_5_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:910:1: ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:911:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:911:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:912:3: lv_addresses_6_0= RULE_HEX_NUM
            	    {
            	    lv_addresses_6_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding1941); 

            	    			newLeafNode(lv_addresses_6_0, grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAddressBindingRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"addresses",
            	            		lv_addresses_6_0, 
            	            		"HEX_NUM");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleAddressBinding1960); 

                	newLeafNode(otherlv_7, grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressBinding"


    // $ANTLR start "entryRuleArgument"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:940:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:941:2: (iv_ruleArgument= ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:942:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1996);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument2006); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgument"


    // $ANTLR start "ruleArgument"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:949:1: ruleArgument returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token lv_lhs_1_0=null;
        Token otherlv_2=null;
        Token lv_text_4_0=null;
        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:952:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:953:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:953:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            int alt18=3;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||(LA18_1>=14 && LA18_1<=15)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==25) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:953:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:953:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:954:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:954:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:955:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2048); 

                    			newLeafNode(lv_simple_0_0, grammarAccess.getArgumentAccess().getSimpleIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"simple",
                            		lv_simple_0_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:7: ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:7: ( (lv_lhs_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:1: (lv_lhs_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:1: (lv_lhs_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:974:3: lv_lhs_1_0= RULE_ID
                    {
                    lv_lhs_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2077); 

                    			newLeafNode(lv_lhs_1_0, grammarAccess.getArgumentAccess().getLhsIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lhs",
                            		lv_lhs_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleArgument2094); 

                        	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:1: ( (lv_rhs_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:1: (lv_rhs_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:1: (lv_rhs_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:996:3: lv_rhs_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleArgument2115);
                    lv_rhs_3_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArgumentRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_3_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1013:6: ( (lv_text_4_0= RULE_STRING ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1013:6: ( (lv_text_4_0= RULE_STRING ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1014:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1014:1: (lv_text_4_0= RULE_STRING )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1015:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument2139); 

                    			newLeafNode(lv_text_4_0, grammarAccess.getArgumentAccess().getTextSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArgumentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"text",
                            		lv_text_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgument"


    // $ANTLR start "entryRuleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1039:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1040:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1041:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation2180);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation2190); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1048:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' otherlv_9= ';' ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_kind_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1051:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' otherlv_9= ';' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1052:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' otherlv_9= ';' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1052:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' otherlv_9= ';' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1052:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleInstantiation2227); 

                	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1056:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1057:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1057:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1058:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleInstantiation2244); 

            			newLeafNode(lv_name_1_0, grammarAccess.getInstantiationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInstantiationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInstantiation2261); 

                	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:1: ( (lv_kind_3_0= ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1079:1: (lv_kind_3_0= ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1079:1: (lv_kind_3_0= ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1080:3: lv_kind_3_0= ruleKind
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleKind_in_ruleInstantiation2282);
            lv_kind_3_0=ruleKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"kind",
                    		lv_kind_3_0, 
                    		"Kind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInstantiation2294); 

                	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1100:1: ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=28 && LA20_0<=29)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1100:2: ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1100:2: ( (lv_properties_5_0= ruleInstantiationProperty ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1101:1: (lv_properties_5_0= ruleInstantiationProperty )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1101:1: (lv_properties_5_0= ruleInstantiationProperty )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1102:3: lv_properties_5_0= ruleInstantiationProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2316);
                    lv_properties_5_0=ruleInstantiationProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_5_0, 
                            		"InstantiationProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1118:2: (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1118:4: otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInstantiation2329); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1122:1: ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1123:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1123:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1124:3: lv_properties_7_0= ruleInstantiationProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2350);
                    	    lv_properties_7_0=ruleInstantiationProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_7_0, 
                    	            		"InstantiationProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInstantiation2366); 

                	newLeafNode(otherlv_8, grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6());
                
            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleInstantiation2378); 

                	newLeafNode(otherlv_9, grammarAccess.getInstantiationAccess().getSemicolonKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleKind"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1156:1: entryRuleKind returns [String current=null] : iv_ruleKind= ruleKind EOF ;
    public final String entryRuleKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKind = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1157:2: (iv_ruleKind= ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1158:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind2415);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind2426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKind"


    // $ANTLR start "ruleKind"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1165:1: ruleKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1168:28: ( (kw= 'READ' | kw= 'WRITE' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1169:1: (kw= 'READ' | kw= 'WRITE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1169:1: (kw= 'READ' | kw= 'WRITE' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1170:2: kw= 'READ'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleKind2464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1177:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleKind2483); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getWRITEKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKind"


    // $ANTLR start "entryRuleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1190:1: entryRuleInstantiationProperty returns [EObject current=null] : iv_ruleInstantiationProperty= ruleInstantiationProperty EOF ;
    public final EObject entryRuleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1191:2: (iv_ruleInstantiationProperty= ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1192:2: iv_ruleInstantiationProperty= ruleInstantiationProperty EOF
            {
             newCompositeNode(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty2523);
            iv_ruleInstantiationProperty=ruleInstantiationProperty();

            state._fsp--;

             current =iv_ruleInstantiationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty2533); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstantiationProperty"


    // $ANTLR start "ruleInstantiationProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1199:1: ruleInstantiationProperty returns [EObject current=null] : ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) ) ;
    public final EObject ruleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_id_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1202:28: ( ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1203:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1203:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1203:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1203:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1203:3: () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1203:3: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1204:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInstantiationProperty2580); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleInstantiationProperty2592); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1217:1: ( (lv_id_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1218:1: (lv_id_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1218:1: (lv_id_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1219:3: lv_id_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleInstantiationProperty2613);
                    lv_id_3_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstantiationPropertyRule());
                    	        }
                           		set(
                           			current, 
                           			"id",
                            		lv_id_3_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1236:6: ( () otherlv_5= 'CRC' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1236:6: ( () otherlv_5= 'CRC' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1236:7: () otherlv_5= 'CRC'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1236:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1237:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleInstantiationProperty2642); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstantiationProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRobot_in_entryRuleRobot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRobot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleRobot130 = new BitSet(new long[]{0x0000000000001012L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleConstructor219 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor250 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstructor267 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor285 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor320 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleConstructor341 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleConstructor354 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleConstructor375 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleConstructor409 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleConstructor425 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleConstructor446 = new BitSet(new long[]{0x00000000001C0010L});
    public static final BitSet FOLLOW_18_in_ruleConstructor459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAddress543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAddress585 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAddress597 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress614 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleAddress632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress649 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleAddress668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_ruleMember762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_ruleMember789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleMember816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLinkBinding898 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLinkBinding910 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleLinkBinding932 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinkBinding945 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleLinkBinding966 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLinkBinding980 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLinkBinding992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLinkProperty1076 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLinkProperty1088 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1130 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLinkProperty1142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLinkProperty1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansionName_in_ruleExpansion1257 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExpansion1269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpansion1289 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExpansion1301 = new BitSet(new long[]{0x0000000000008090L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleExpansion1323 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleExpansion1336 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleExpansion1357 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleExpansion1373 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleExpansion1395 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_14_in_ruleExpansion1408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleExpansion1429 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_21_in_ruleExpansion1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansionName_in_entryRuleExpansionName1481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansionName1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansionName_in_ruleExpansionName1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansionName_in_ruleExpansionName1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansionName_in_entryRuleAddressExpansionName1600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansionName1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAddressExpansionName1647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansionName1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansionName_in_entryRuleSimpleExpansionName1705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansionName1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansionName1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding1796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleAddressBinding1843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressBinding1860 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAddressBinding1877 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAddressBinding1889 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding1906 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleAddressBinding1924 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding1941 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleAddressBinding1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1996 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2077 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArgument2094 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument2115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument2139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleInstantiation2227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleInstantiation2244 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiation2261 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleKind_in_ruleInstantiation2282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInstantiation2294 = new BitSet(new long[]{0x0000000030008000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2316 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleInstantiation2329 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2350 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiation2366 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleInstantiation2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind2415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleKind2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleKind2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty2523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInstantiationProperty2580 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInstantiationProperty2592 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleInstantiationProperty2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInstantiationProperty2642 = new BitSet(new long[]{0x0000000000000002L});

}