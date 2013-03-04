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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_NUM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'('", "','", "')'", "':'", "'{'", "';'", "'}'", "'@'", "'TOSNET'", "'LINK'", "'='", "'BASE'", "'+'", "'READ'", "'WRITE'", "'ID'", "'CRC'", "'PUBLISH'", "'.'", "'ALL'"
    };
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
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:115:1: ruleConstructor returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' ) ;
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
        Token otherlv_14=null;
        EObject lv_addresses_8_0 = null;

        EObject lv_addresses_10_0 = null;

        EObject lv_members_12_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:118:28: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:119:2: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleAddress ) ) (otherlv_9= ',' ( (lv_addresses_10_0= ruleAddress ) ) )* )? otherlv_11= '{' ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )* otherlv_14= '}'
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
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:1: ( ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:2: ( (lv_members_12_0= ruleMember ) ) otherlv_13= ';'
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:2: ( (lv_members_12_0= ruleMember ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:249:1: (lv_members_12_0= ruleMember )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:249:1: (lv_members_12_0= ruleMember )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:250:3: lv_members_12_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleConstructor447);
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

            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleConstructor459); 

            	        	newLeafNode(otherlv_13, grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleConstructor473); 

                	newLeafNode(otherlv_14, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
                

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:282:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:283:2: (iv_ruleAddress= ruleAddress EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:284:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress509);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress519); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:291:1: ruleAddress returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:294:28: ( ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:1: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:1: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_ID) ) {
                    alt9=1;
                }
                else if ( (LA9_1==13) ) {
                    alt9=2;
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:4: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAddress557); 

                        	newLeafNode(otherlv_0, grammarAccess.getAddressAccess().getCommercialAtKeyword_0_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:299:1: ( (lv_name_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:300:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:300:1: (lv_name_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:301:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress574); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:318:6: (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:318:6: (otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:318:8: otherlv_2= '@' otherlv_3= '(' ( (lv_elements_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAddress599); 

                        	newLeafNode(otherlv_2, grammarAccess.getAddressAccess().getCommercialAtKeyword_1_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAddress611); 

                        	newLeafNode(otherlv_3, grammarAccess.getAddressAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:326:1: ( (lv_elements_4_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:327:1: (lv_elements_4_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:327:1: (lv_elements_4_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:328:3: lv_elements_4_0= RULE_ID
                    {
                    lv_elements_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress628); 

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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:2: (otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:4: otherlv_5= ',' ( (lv_elements_6_0= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAddress646); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAddressAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:348:1: ( (lv_elements_6_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:349:1: (lv_elements_6_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:349:1: (lv_elements_6_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:350:3: lv_elements_6_0= RULE_ID
                    	    {
                    	    lv_elements_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddress663); 

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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleAddress682); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:378:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:379:2: (iv_ruleMember= ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:380:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember719);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember729); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:387:1: ruleMember returns [EObject current=null] : (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_LinkBinding_0 = null;

        EObject this_Expansion_1 = null;

        EObject this_Instantiation_2 = null;

        EObject this_Grouping_3 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:390:28: ( (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:391:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:391:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==23) ) {
                    alt10=4;
                }
                else if ( (LA10_2==16) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==RULE_ID) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==16) ) {
                        int LA10_7 = input.LA(4);

                        if ( ((LA10_7>=26 && LA10_7<=27)) ) {
                            alt10=3;
                        }
                        else if ( (LA10_7==RULE_ID) ) {
                            alt10=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 7, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA10_6==23) ) {
                        alt10=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 6, input);

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:392:5: this_LinkBinding_0= ruleLinkBinding
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinkBinding_in_ruleMember776);
                    this_LinkBinding_0=ruleLinkBinding();

                    state._fsp--;

                     
                            current = this_LinkBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:402:5: this_Expansion_1= ruleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpansion_in_ruleMember803);
                    this_Expansion_1=ruleExpansion();

                    state._fsp--;

                     
                            current = this_Expansion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:412:5: this_Instantiation_2= ruleInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleMember830);
                    this_Instantiation_2=ruleInstantiation();

                    state._fsp--;

                     
                            current = this_Instantiation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:422:5: this_Grouping_3= ruleGrouping
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGrouping_in_ruleMember857);
                    this_Grouping_3=ruleGrouping();

                    state._fsp--;

                     
                            current = this_Grouping_3; 
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:438:1: entryRuleLinkBinding returns [EObject current=null] : iv_ruleLinkBinding= ruleLinkBinding EOF ;
    public final EObject entryRuleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:439:2: (iv_ruleLinkBinding= ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:440:2: iv_ruleLinkBinding= ruleLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding892);
            iv_ruleLinkBinding=ruleLinkBinding();

            state._fsp--;

             current =iv_ruleLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding902); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:447:1: ruleLinkBinding returns [EObject current=null] : (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' ) ;
    public final EObject ruleLinkBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:450:28: ( (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:451:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:451:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:451:3: otherlv_0= 'TOSNET' otherlv_1= '(' ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleLinkBinding939); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkBindingAccess().getTOSNETKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleLinkBinding951); 

                	newLeafNode(otherlv_1, grammarAccess.getLinkBindingAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:459:1: ( ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:459:2: ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:459:2: ( (lv_properties_2_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:460:1: (lv_properties_2_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:460:1: (lv_properties_2_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:461:3: lv_properties_2_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleLinkBinding973);
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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:477:2: (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:477:4: otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) )
            {
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleLinkBinding986); 

                	newLeafNode(otherlv_3, grammarAccess.getLinkBindingAccess().getCommaKeyword_2_1_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:481:1: ( (lv_properties_4_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:482:1: (lv_properties_4_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:482:1: (lv_properties_4_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:483:3: lv_properties_4_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleLinkBinding1007);
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

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLinkBinding1021); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkBindingAccess().getRightParenthesisKeyword_3());
                

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:511:1: entryRuleLinkProperty returns [EObject current=null] : iv_ruleLinkProperty= ruleLinkProperty EOF ;
    public final EObject entryRuleLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:512:2: (iv_ruleLinkProperty= ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:513:2: iv_ruleLinkProperty= ruleLinkProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1057);
            iv_ruleLinkProperty=ruleLinkProperty();

            state._fsp--;

             current =iv_ruleLinkProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty1067); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:520:1: ruleLinkProperty returns [EObject current=null] : ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:523:28: ( ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:1: ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:1: ( (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) )
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:2: (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:2: (otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:4: otherlv_0= 'LINK' otherlv_1= '=' ( (lv_linkName_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleLinkProperty1105); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinkPropertyAccess().getLINKKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleLinkProperty1117); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:532:1: ( (lv_linkName_2_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:533:1: (lv_linkName_2_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:533:1: (lv_linkName_2_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:534:3: lv_linkName_2_0= RULE_ID
                    {
                    lv_linkName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1134); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:551:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:551:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:551:8: otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1159); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleLinkProperty1171); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:559:1: ( (lv_baseValue_5_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:560:1: (lv_baseValue_5_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:560:1: (lv_baseValue_5_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:561:3: lv_baseValue_5_0= RULE_INT
                    {
                    lv_baseValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLinkProperty1188); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:585:1: entryRuleExpansion returns [EObject current=null] : iv_ruleExpansion= ruleExpansion EOF ;
    public final EObject entryRuleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:586:2: (iv_ruleExpansion= ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:587:2: iv_ruleExpansion= ruleExpansion EOF
            {
             newCompositeNode(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion1230);
            iv_ruleExpansion=ruleExpansion();

            state._fsp--;

             current =iv_ruleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion1240); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:594:1: ruleExpansion returns [EObject current=null] : ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) ;
    public final EObject ruleExpansion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_identifier_0_0 = null;

        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_bindings_8_0 = null;

        EObject lv_bindings_10_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:597:28: ( ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:598:1: ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:598:1: ( ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:598:2: ( (lv_identifier_0_0= ruleExpansionName ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:598:2: ( (lv_identifier_0_0= ruleExpansionName ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:599:1: (lv_identifier_0_0= ruleExpansionName )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:599:1: (lv_identifier_0_0= ruleExpansionName )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:600:3: lv_identifier_0_0= ruleExpansionName
            {
             
            	        newCompositeNode(grammarAccess.getExpansionAccess().getIdentifierExpansionNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleExpansionName_in_ruleExpansion1286);
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleExpansion1298); 

                	newLeafNode(otherlv_1, grammarAccess.getExpansionAccess().getColonKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:620:1: ( (otherlv_2= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:621:1: (otherlv_2= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:621:1: (otherlv_2= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:622:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExpansionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExpansion1318); 

            		newLeafNode(otherlv_2, grammarAccess.getExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleExpansion1330); 

                	newLeafNode(otherlv_3, grammarAccess.getExpansionAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:637:1: ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:637:2: ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:637:2: ( (lv_arguments_4_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:638:1: (lv_arguments_4_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:638:1: (lv_arguments_4_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:639:3: lv_arguments_4_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleExpansion1352);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:655:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==14) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:655:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleExpansion1365); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getExpansionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:659:1: ( (lv_arguments_6_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:660:1: (lv_arguments_6_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:660:1: (lv_arguments_6_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:661:3: lv_arguments_6_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleExpansion1386);
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

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleExpansion1402); 

                	newLeafNode(otherlv_7, grammarAccess.getExpansionAccess().getRightParenthesisKeyword_5());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:681:1: ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:681:2: ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:681:2: ( (lv_bindings_8_0= ruleAddressBinding ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:682:1: (lv_bindings_8_0= ruleAddressBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:682:1: (lv_bindings_8_0= ruleAddressBinding )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:683:3: lv_bindings_8_0= ruleAddressBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddressBinding_in_ruleExpansion1424);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:699:2: (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:699:4: otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleExpansion1437); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getExpansionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:703:1: ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:704:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:704:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:705:3: lv_bindings_10_0= ruleAddressBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddressBinding_in_ruleExpansion1458);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:729:1: entryRuleExpansionName returns [EObject current=null] : iv_ruleExpansionName= ruleExpansionName EOF ;
    public final EObject entryRuleExpansionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansionName = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:730:2: (iv_ruleExpansionName= ruleExpansionName EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:731:2: iv_ruleExpansionName= ruleExpansionName EOF
            {
             newCompositeNode(grammarAccess.getExpansionNameRule()); 
            pushFollow(FOLLOW_ruleExpansionName_in_entryRuleExpansionName1498);
            iv_ruleExpansionName=ruleExpansionName();

            state._fsp--;

             current =iv_ruleExpansionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansionName1508); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:738:1: ruleExpansionName returns [EObject current=null] : (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName ) ;
    public final EObject ruleExpansionName() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpansionName_0 = null;

        EObject this_AddressExpansionName_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:741:28: ( (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:742:1: (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:742:1: (this_SimpleExpansionName_0= ruleSimpleExpansionName | this_AddressExpansionName_1= ruleAddressExpansionName )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==20) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:743:5: this_SimpleExpansionName_0= ruleSimpleExpansionName
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionNameAccess().getSimpleExpansionNameParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleExpansionName_in_ruleExpansionName1555);
                    this_SimpleExpansionName_0=ruleSimpleExpansionName();

                    state._fsp--;

                     
                            current = this_SimpleExpansionName_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:753:5: this_AddressExpansionName_1= ruleAddressExpansionName
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionNameAccess().getAddressExpansionNameParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressExpansionName_in_ruleExpansionName1582);
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


    // $ANTLR start "entryRuleSimpleExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:769:1: entryRuleSimpleExpansionName returns [EObject current=null] : iv_ruleSimpleExpansionName= ruleSimpleExpansionName EOF ;
    public final EObject entryRuleSimpleExpansionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpansionName = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:770:2: (iv_ruleSimpleExpansionName= ruleSimpleExpansionName EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:771:2: iv_ruleSimpleExpansionName= ruleSimpleExpansionName EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpansionNameRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansionName_in_entryRuleSimpleExpansionName1617);
            iv_ruleSimpleExpansionName=ruleSimpleExpansionName();

            state._fsp--;

             current =iv_ruleSimpleExpansionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansionName1627); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:778:1: ruleSimpleExpansionName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleExpansionName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:781:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:782:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:782:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:783:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:783:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:784:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansionName1668); 

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


    // $ANTLR start "entryRuleAddressExpansionName"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:808:1: entryRuleAddressExpansionName returns [EObject current=null] : iv_ruleAddressExpansionName= ruleAddressExpansionName EOF ;
    public final EObject entryRuleAddressExpansionName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressExpansionName = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:809:2: (iv_ruleAddressExpansionName= ruleAddressExpansionName EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:810:2: iv_ruleAddressExpansionName= ruleAddressExpansionName EOF
            {
             newCompositeNode(grammarAccess.getAddressExpansionNameRule()); 
            pushFollow(FOLLOW_ruleAddressExpansionName_in_entryRuleAddressExpansionName1708);
            iv_ruleAddressExpansionName=ruleAddressExpansionName();

            state._fsp--;

             current =iv_ruleAddressExpansionName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansionName1718); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:817:1: ruleAddressExpansionName returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleAddressExpansionName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:820:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:821:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:821:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:821:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAddressExpansionName1755); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressExpansionNameAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:825:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:826:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:826:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:827:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansionName1772); 

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


    // $ANTLR start "entryRuleArgument"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:851:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:852:2: (iv_ruleArgument= ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:853:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument1813);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument1823); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:860:1: ruleArgument returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token lv_lhs_1_0=null;
        Token otherlv_2=null;
        Token lv_text_4_0=null;
        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:863:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            int alt17=3;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==25) ) {
                    alt17=2;
                }
                else if ( (LA17_1==EOF||(LA17_1>=14 && LA17_1<=15)) ) {
                    alt17=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:865:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:865:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:866:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1865); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:883:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:883:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:883:7: ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:883:7: ( (lv_lhs_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:884:1: (lv_lhs_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:884:1: (lv_lhs_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:885:3: lv_lhs_1_0= RULE_ID
                    {
                    lv_lhs_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument1894); 

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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleArgument1911); 

                        	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:905:1: ( (lv_rhs_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:906:1: (lv_rhs_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:906:1: (lv_rhs_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:907:3: lv_rhs_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleArgument1932);
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:924:6: ( (lv_text_4_0= RULE_STRING ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:924:6: ( (lv_text_4_0= RULE_STRING ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:925:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:925:1: (lv_text_4_0= RULE_STRING )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:926:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument1956); 

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


    // $ANTLR start "entryRuleAddressBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:950:1: entryRuleAddressBinding returns [EObject current=null] : iv_ruleAddressBinding= ruleAddressBinding EOF ;
    public final EObject entryRuleAddressBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:951:2: (iv_ruleAddressBinding= ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:952:2: iv_ruleAddressBinding= ruleAddressBinding EOF
            {
             newCompositeNode(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding1997);
            iv_ruleAddressBinding=ruleAddressBinding();

            state._fsp--;

             current =iv_ruleAddressBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding2007); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:959:1: ruleAddressBinding returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:962:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:963:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:963:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:963:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAddressBinding2044); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:967:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:968:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:968:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:969:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressBinding2061); 

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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAddressBinding2078); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleAddressBinding2090); 

                	newLeafNode(otherlv_3, grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:993:1: ( (lv_addresses_4_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:1: (lv_addresses_4_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:1: (lv_addresses_4_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:3: lv_addresses_4_0= RULE_HEX_NUM
            {
            lv_addresses_4_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2107); 

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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1011:2: (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==14) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1011:4: otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleAddressBinding2125); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAddressBindingAccess().getCommaKeyword_5_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1015:1: ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1016:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1016:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1017:3: lv_addresses_6_0= RULE_HEX_NUM
            	    {
            	    lv_addresses_6_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2142); 

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
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleAddressBinding2161); 

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


    // $ANTLR start "entryRuleInstantiation"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1045:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1046:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1047:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation2197);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation2207); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1054:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_address_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_7_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1057:28: ( (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1058:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1058:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1058:3: otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleInstantiation2244); 

                	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1062:1: ( (lv_address_1_0= ruleAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1063:1: (lv_address_1_0= ruleAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1063:1: (lv_address_1_0= ruleAddressSpec )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1064:3: lv_address_1_0= ruleAddressSpec
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAddressSpec_in_ruleInstantiation2265);
            lv_address_1_0=ruleAddressSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_1_0, 
                    		"AddressSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleInstantiation2277); 

                	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1084:1: ( (lv_kind_3_0= ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1085:1: (lv_kind_3_0= ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1085:1: (lv_kind_3_0= ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1086:3: lv_kind_3_0= ruleKind
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleKind_in_ruleInstantiation2298);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleInstantiation2310); 

                	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1106:1: ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=28 && LA20_0<=30)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1106:2: ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1106:2: ( (lv_properties_5_0= ruleInstantiationProperty ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1107:1: (lv_properties_5_0= ruleInstantiationProperty )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1107:1: (lv_properties_5_0= ruleInstantiationProperty )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1108:3: lv_properties_5_0= ruleInstantiationProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2332);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1124:2: (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1124:4: otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleInstantiation2345); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1128:1: ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1129:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1129:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1130:3: lv_properties_7_0= ruleInstantiationProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2366);
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

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInstantiation2382); 

                	newLeafNode(otherlv_8, grammarAccess.getInstantiationAccess().getRightParenthesisKeyword_6());
                

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


    // $ANTLR start "entryRuleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1158:1: entryRuleAddressSpec returns [EObject current=null] : iv_ruleAddressSpec= ruleAddressSpec EOF ;
    public final EObject entryRuleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1159:2: (iv_ruleAddressSpec= ruleAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1160:2: iv_ruleAddressSpec= ruleAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getAddressSpecRule()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2418);
            iv_ruleAddressSpec=ruleAddressSpec();

            state._fsp--;

             current =iv_ruleAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressSpec2428); 

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
    // $ANTLR end "entryRuleAddressSpec"


    // $ANTLR start "ruleAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1167:1: ruleAddressSpec returns [EObject current=null] : (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) ;
    public final EObject ruleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject this_DirectAddressSpec_0 = null;

        EObject this_NamedAddressSpec_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1170:28: ( (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1171:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1171:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==23) ) {
                    alt21=1;
                }
                else if ( (LA21_1==EOF||LA21_1==16) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1172:5: this_DirectAddressSpec_0= ruleDirectAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2475);
                    this_DirectAddressSpec_0=ruleDirectAddressSpec();

                    state._fsp--;

                     
                            current = this_DirectAddressSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1182:5: this_NamedAddressSpec_1= ruleNamedAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2502);
                    this_NamedAddressSpec_1=ruleNamedAddressSpec();

                    state._fsp--;

                     
                            current = this_NamedAddressSpec_1; 
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
    // $ANTLR end "ruleAddressSpec"


    // $ANTLR start "entryRuleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1198:1: entryRuleDirectAddressSpec returns [EObject current=null] : iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF ;
    public final EObject entryRuleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1199:2: (iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1200:2: iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getDirectAddressSpecRule()); 
            pushFollow(FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2537);
            iv_ruleDirectAddressSpec=ruleDirectAddressSpec();

            state._fsp--;

             current =iv_ruleDirectAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectAddressSpec2547); 

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
    // $ANTLR end "entryRuleDirectAddressSpec"


    // $ANTLR start "ruleDirectAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1207:1: ruleDirectAddressSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) ;
    public final EObject ruleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_address_2_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1210:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1211:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1211:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1211:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1212:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1212:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1213:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectAddressSpec2589); 

            			newLeafNode(lv_name_0_0, grammarAccess.getDirectAddressSpecAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectAddressSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleDirectAddressSpec2606); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1233:1: ( (lv_address_2_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1234:1: (lv_address_2_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1234:1: (lv_address_2_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1235:3: lv_address_2_0= RULE_HEX_NUM
            {
            lv_address_2_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec2623); 

            			newLeafNode(lv_address_2_0, grammarAccess.getDirectAddressSpecAccess().getAddressHEX_NUMTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDirectAddressSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"address",
                    		lv_address_2_0, 
                    		"HEX_NUM");
            	    

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
    // $ANTLR end "ruleDirectAddressSpec"


    // $ANTLR start "entryRuleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1259:1: entryRuleNamedAddressSpec returns [EObject current=null] : iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF ;
    public final EObject entryRuleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1260:2: (iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1261:2: iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getNamedAddressSpecRule()); 
            pushFollow(FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec2664);
            iv_ruleNamedAddressSpec=ruleNamedAddressSpec();

            state._fsp--;

             current =iv_ruleNamedAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddressSpec2674); 

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
    // $ANTLR end "entryRuleNamedAddressSpec"


    // $ANTLR start "ruleNamedAddressSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1268:1: ruleNamedAddressSpec returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1271:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1272:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1272:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1273:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1273:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1274:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddressSpec2715); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNamedAddressSpecAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedAddressSpecRule());
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
    // $ANTLR end "ruleNamedAddressSpec"


    // $ANTLR start "entryRuleKind"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1298:1: entryRuleKind returns [String current=null] : iv_ruleKind= ruleKind EOF ;
    public final String entryRuleKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKind = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1299:2: (iv_ruleKind= ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1300:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind2756);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind2767); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1307:1: ruleKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1310:28: ( (kw= 'READ' | kw= 'WRITE' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1311:1: (kw= 'READ' | kw= 'WRITE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1311:1: (kw= 'READ' | kw= 'WRITE' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            else if ( (LA22_0==27) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1312:2: kw= 'READ'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleKind2805); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1319:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleKind2824); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1332:1: entryRuleInstantiationProperty returns [EObject current=null] : iv_ruleInstantiationProperty= ruleInstantiationProperty EOF ;
    public final EObject entryRuleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1333:2: (iv_ruleInstantiationProperty= ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1334:2: iv_ruleInstantiationProperty= ruleInstantiationProperty EOF
            {
             newCompositeNode(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty2864);
            iv_ruleInstantiationProperty=ruleInstantiationProperty();

            state._fsp--;

             current =iv_ruleInstantiationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty2874); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1341:1: ruleInstantiationProperty returns [EObject current=null] : ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_mode_9_0=null;
        Token otherlv_10=null;
        Token lv_rate_11_0=null;
        Token otherlv_12=null;
        EObject lv_id_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1344:28: ( ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt23=1;
                }
                break;
            case 29:
                {
                alt23=2;
                }
                break;
            case 30:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:3: () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:3: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1346:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleInstantiationProperty2921); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleInstantiationProperty2933); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1359:1: ( (lv_id_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1360:1: (lv_id_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1360:1: (lv_id_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1361:3: lv_id_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleInstantiationProperty2954);
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1378:6: ( () otherlv_5= 'CRC' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1378:6: ( () otherlv_5= 'CRC' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1378:7: () otherlv_5= 'CRC'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1378:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1379:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleInstantiationProperty2983); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1389:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1389:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1389:7: () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1389:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1390:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getPublishPopertyAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,30,FOLLOW_30_in_ruleInstantiationProperty3012); 

                        	newLeafNode(otherlv_7, grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1());
                        
                    otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleInstantiationProperty3024); 

                        	newLeafNode(otherlv_8, grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1403:1: ( (lv_mode_9_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1404:1: (lv_mode_9_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1404:1: (lv_mode_9_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1405:3: lv_mode_9_0= RULE_INT
                    {
                    lv_mode_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3041); 

                    			newLeafNode(lv_mode_9_0, grammarAccess.getInstantiationPropertyAccess().getModeINTTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstantiationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"mode",
                            		lv_mode_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleInstantiationProperty3058); 

                        	newLeafNode(otherlv_10, grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1425:1: ( (lv_rate_11_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1426:1: (lv_rate_11_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1426:1: (lv_rate_11_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1427:3: lv_rate_11_0= RULE_INT
                    {
                    lv_rate_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3075); 

                    			newLeafNode(lv_rate_11_0, grammarAccess.getInstantiationPropertyAccess().getRateINTTerminalRuleCall_2_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getInstantiationPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"rate",
                            		lv_rate_11_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleInstantiationProperty3092); 

                        	newLeafNode(otherlv_12, grammarAccess.getInstantiationPropertyAccess().getRightParenthesisKeyword_2_6());
                        

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


    // $ANTLR start "entryRuleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1455:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1456:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1457:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping3129);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping3139); 

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
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1464:1: ruleGrouping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1467:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1469:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1469:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1470:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrouping3181); 

            			newLeafNode(lv_name_0_0, grammarAccess.getGroupingAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleGrouping3198); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupingAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1490:1: ( (lv_elements_2_0= ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1491:1: (lv_elements_2_0= ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1491:1: (lv_elements_2_0= ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1492:3: lv_elements_2_0= ruleGroupElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3219);
            lv_elements_2_0=ruleGroupElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupingRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"GroupElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1508:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==14) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1508:4: otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGrouping3232); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupingAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1512:1: ( (lv_elements_4_0= ruleGroupElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1513:1: (lv_elements_4_0= ruleGroupElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1513:1: (lv_elements_4_0= ruleGroupElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1514:3: lv_elements_4_0= ruleGroupElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3253);
            	    lv_elements_4_0=ruleGroupElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"GroupElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


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
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1538:1: entryRuleGroupElement returns [EObject current=null] : iv_ruleGroupElement= ruleGroupElement EOF ;
    public final EObject entryRuleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1539:2: (iv_ruleGroupElement= ruleGroupElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:2: iv_ruleGroupElement= ruleGroupElement EOF
            {
             newCompositeNode(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement3291);
            iv_ruleGroupElement=ruleGroupElement();

            state._fsp--;

             current =iv_ruleGroupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement3301); 

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
    // $ANTLR end "entryRuleGroupElement"


    // $ANTLR start "ruleGroupElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1547:1: ruleGroupElement returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) ;
    public final EObject ruleGroupElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1550:28: ( ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:2: ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:2: ( (lv_path_0_0= rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1552:1: (lv_path_0_0= rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1552:1: (lv_path_0_0= rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1553:3: lv_path_0_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3347);
            lv_path_0_0=rulePathElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupElementRule());
            	        }
                   		add(
                   			current, 
                   			"path",
                    		lv_path_0_0, 
                    		"PathElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1569:2: (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1569:4: otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleGroupElement3360); 

            	        	newLeafNode(otherlv_1, grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1573:1: ( (lv_path_2_0= rulePathElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1574:1: (lv_path_2_0= rulePathElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1574:1: (lv_path_2_0= rulePathElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1575:3: lv_path_2_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3381);
            	    lv_path_2_0=rulePathElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"path",
            	            		lv_path_2_0, 
            	            		"PathElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


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
    // $ANTLR end "ruleGroupElement"


    // $ANTLR start "entryRulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1599:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1600:2: (iv_rulePathElement= rulePathElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1601:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement3419);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement3429); 

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
    // $ANTLR end "entryRulePathElement"


    // $ANTLR start "rulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1608:1: rulePathElement returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1611:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1612:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1612:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==32) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1612:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1612:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1613:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1613:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1614:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3471); 

                    			newLeafNode(lv_simple_0_0, grammarAccess.getPathElementAccess().getSimpleIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathElementRule());
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1631:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1631:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1631:8: otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_rulePathElement3495); 

                        	newLeafNode(otherlv_1, grammarAccess.getPathElementAccess().getALLKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_rulePathElement3507); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1639:1: ( (otherlv_3= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1640:1: (otherlv_3= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1640:1: (otherlv_3= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1641:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathElementRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3527); 

                    		newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_rulePathElement3539); 

                        	newLeafNode(otherlv_4, grammarAccess.getPathElementAccess().getRightParenthesisKeyword_1_3());
                        

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
    // $ANTLR end "rulePathElement"

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
    public static final BitSet FOLLOW_16_in_ruleConstructor354 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleConstructor375 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor388 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleConstructor409 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleConstructor425 = new BitSet(new long[]{0x0000000000380010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleConstructor447 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleConstructor459 = new BitSet(new long[]{0x0000000000380010L});
    public static final BitSet FOLLOW_19_in_ruleConstructor473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAddress557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAddress599 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAddress611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress628 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleAddress646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddress663 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleAddress682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_ruleMember776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_ruleMember803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleMember830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleMember857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleLinkBinding939 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLinkBinding951 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleLinkBinding973 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinkBinding986 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleLinkBinding1007 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleLinkBinding1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleLinkProperty1105 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLinkProperty1117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1159 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleLinkProperty1171 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLinkProperty1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion1230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansionName_in_ruleExpansion1286 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleExpansion1298 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExpansion1318 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleExpansion1330 = new BitSet(new long[]{0x0000000000008050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleExpansion1352 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleExpansion1365 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleExpansion1386 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleExpansion1402 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleExpansion1424 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleExpansion1437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleExpansion1458 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleExpansionName_in_entryRuleExpansionName1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansionName1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansionName_in_ruleExpansionName1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansionName_in_ruleExpansionName1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansionName_in_entryRuleSimpleExpansionName1617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansionName1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansionName1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansionName_in_entryRuleAddressExpansionName1708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansionName1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAddressExpansionName1755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansionName1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument1813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument1894 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleArgument1911 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding1997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAddressBinding2044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressBinding2061 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAddressBinding2078 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAddressBinding2090 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2107 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleAddressBinding2125 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2142 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleAddressBinding2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation2197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleInstantiation2244 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_ruleInstantiation2265 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiation2277 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleKind_in_ruleInstantiation2298 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInstantiation2310 = new BitSet(new long[]{0x0000000070008000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2332 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_14_in_ruleInstantiation2345 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2366 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiation2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressSpec2428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectAddressSpec2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectAddressSpec2589 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleDirectAddressSpec2606 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec2664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddressSpec2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddressSpec2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind2756 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleKind2805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleKind2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty2864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleInstantiationProperty2921 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInstantiationProperty2933 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleInstantiationProperty2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInstantiationProperty2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInstantiationProperty3012 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleInstantiationProperty3024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3041 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleInstantiationProperty3058 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3075 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiationProperty3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping3129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrouping3181 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGrouping3198 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3219 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleGrouping3232 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3253 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement3291 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement3301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3347 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleGroupElement3360 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3381 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePathElement3495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePathElement3507 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3527 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePathElement3539 = new BitSet(new long[]{0x0000000000000002L});

}