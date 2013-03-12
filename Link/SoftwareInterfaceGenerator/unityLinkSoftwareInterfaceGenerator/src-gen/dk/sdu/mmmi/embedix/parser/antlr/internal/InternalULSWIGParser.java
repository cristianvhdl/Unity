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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_NUM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "'.'", "';'", "'public'", "'('", "','", "')'", "':'", "'{'", "'}'", "'@'", "'TOSNET'", "'CTRL'", "'='", "'BASE'", "'UART'", "'+'", "'READ'", "'WRITE'", "'ID'", "'CRC'", "'PUBLISH'", "'ALL'"
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
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
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
        	return "LinkSpec";	
       	}
       	
       	@Override
       	protected ULSWIGGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:67:1: entryRuleLinkSpec returns [EObject current=null] : iv_ruleLinkSpec= ruleLinkSpec EOF ;
    public final EObject entryRuleLinkSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:68:2: (iv_ruleLinkSpec= ruleLinkSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:69:2: iv_ruleLinkSpec= ruleLinkSpec EOF
            {
             newCompositeNode(grammarAccess.getLinkSpecRule()); 
            pushFollow(FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec75);
            iv_ruleLinkSpec=ruleLinkSpec();

            state._fsp--;

             current =iv_ruleLinkSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkSpec85); 

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
    // $ANTLR end "entryRuleLinkSpec"


    // $ANTLR start "ruleLinkSpec"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:76:1: ruleLinkSpec returns [EObject current=null] : (otherlv_0= 'link' ( ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_constructors_5_0= ruleConstructor ) )* ) ;
    public final EObject ruleLinkSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_packagename_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        EObject lv_constructors_5_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:79:28: ( (otherlv_0= 'link' ( ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_constructors_5_0= ruleConstructor ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: (otherlv_0= 'link' ( ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_constructors_5_0= ruleConstructor ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: (otherlv_0= 'link' ( ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_constructors_5_0= ruleConstructor ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:3: otherlv_0= 'link' ( ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.' )? ( (lv_name_3_0= RULE_ID ) ) otherlv_4= ';' ( (lv_constructors_5_0= ruleConstructor ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLinkSpec122); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkSpecAccess().getLinkKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:84:1: ( ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==13) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:84:2: ( (lv_packagename_1_0= RULE_ID ) ) otherlv_2= '.'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:84:2: ( (lv_packagename_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:85:1: (lv_packagename_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:85:1: (lv_packagename_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:86:3: lv_packagename_1_0= RULE_ID
                    {
                    lv_packagename_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkSpec140); 

                    			newLeafNode(lv_packagename_1_0, grammarAccess.getLinkSpecAccess().getPackagenameIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkSpecRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"packagename",
                            		lv_packagename_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLinkSpec157); 

                        	newLeafNode(otherlv_2, grammarAccess.getLinkSpecAccess().getFullStopKeyword_1_1());
                        

                    }
                    break;

            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:106:3: ( (lv_name_3_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:1: (lv_name_3_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:1: (lv_name_3_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:108:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkSpec176); 

            			newLeafNode(lv_name_3_0, grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"ID");
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleLinkSpec193); 

                	newLeafNode(otherlv_4, grammarAccess.getLinkSpecAccess().getSemicolonKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:128:1: ( (lv_constructors_5_0= ruleConstructor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:129:1: (lv_constructors_5_0= ruleConstructor )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:129:1: (lv_constructors_5_0= ruleConstructor )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:130:3: lv_constructors_5_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleLinkSpec214);
            	    lv_constructors_5_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_5_0, 
            	            		"Constructor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleLinkSpec"


    // $ANTLR start "entryRuleConstructor"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:154:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:155:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:156:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor251);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor261); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:163:1: ruleConstructor returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' ) ;
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
        Token otherlv_12=null;
        EObject lv_addresses_8_0 = null;

        EObject lv_members_10_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:166:28: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:167:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:167:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:167:2: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}'
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:167:2: ( (lv_isPublic_0_0= 'public' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:168:1: (lv_isPublic_0_0= 'public' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:168:1: (lv_isPublic_0_0= 'public' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:169:3: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,15,FOLLOW_15_in_ruleConstructor304); 

                            newLeafNode(lv_isPublic_0_0, grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(current, "isPublic", true, "public");
                    	    

                    }


                    }
                    break;

            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:3: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:183:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:183:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor335); 

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

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleConstructor352); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:204:1: ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:204:2: ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:204:2: ( (lv_parameters_3_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_parameters_3_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_parameters_3_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:206:3: lv_parameters_3_0= RULE_ID
                    {
                    lv_parameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor370); 

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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:222:2: (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==17) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:222:4: otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleConstructor388); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:226:1: ( (lv_parameters_5_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:227:1: (lv_parameters_5_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:227:1: (lv_parameters_5_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:228:3: lv_parameters_5_0= RULE_ID
                    	    {
                    	    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor405); 

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
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleConstructor426); 

                	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:1: (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:248:3: otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleConstructor439); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getColonKeyword_5_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:252:1: ( (lv_addresses_8_0= ruleConstructorAddressParameters ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:253:1: (lv_addresses_8_0= ruleConstructorAddressParameters )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:253:1: (lv_addresses_8_0= ruleConstructorAddressParameters )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:254:3: lv_addresses_8_0= ruleConstructorAddressParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getAddressesConstructorAddressParametersParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstructorAddressParameters_in_ruleConstructor460);
                    lv_addresses_8_0=ruleConstructorAddressParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
                    	        }
                           		set(
                           			current, 
                           			"addresses",
                            		lv_addresses_8_0, 
                            		"ConstructorAddressParameters");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleConstructor474); 

                	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:274:1: ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=22 && LA7_0<=23)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:274:2: ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';'
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:274:2: ( (lv_members_10_0= ruleMember ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:275:1: (lv_members_10_0= ruleMember )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:275:1: (lv_members_10_0= ruleMember )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:276:3: lv_members_10_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleConstructor496);
            	    lv_members_10_0=ruleMember();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getConstructorRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"members",
            	            		lv_members_10_0, 
            	            		"Member");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,14,FOLLOW_14_in_ruleConstructor508); 

            	        	newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleConstructor522); 

                	newLeafNode(otherlv_12, grammarAccess.getConstructorAccess().getRightCurlyBracketKeyword_8());
                

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


    // $ANTLR start "entryRuleConstructorAddressParameters"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:308:1: entryRuleConstructorAddressParameters returns [EObject current=null] : iv_ruleConstructorAddressParameters= ruleConstructorAddressParameters EOF ;
    public final EObject entryRuleConstructorAddressParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorAddressParameters = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:309:2: (iv_ruleConstructorAddressParameters= ruleConstructorAddressParameters EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:310:2: iv_ruleConstructorAddressParameters= ruleConstructorAddressParameters EOF
            {
             newCompositeNode(grammarAccess.getConstructorAddressParametersRule()); 
            pushFollow(FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters558);
            iv_ruleConstructorAddressParameters=ruleConstructorAddressParameters();

            state._fsp--;

             current =iv_ruleConstructorAddressParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorAddressParameters568); 

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
    // $ANTLR end "entryRuleConstructorAddressParameters"


    // $ANTLR start "ruleConstructorAddressParameters"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:317:1: ruleConstructorAddressParameters returns [EObject current=null] : (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple ) ;
    public final EObject ruleConstructorAddressParameters() throws RecognitionException {
        EObject current = null;

        EObject this_NamedAddresses_0 = null;

        EObject this_AddressTuple_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:320:28: ( (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:1: (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:321:1: (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    alt8=1;
                }
                else if ( (LA8_1==16) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:322:5: this_NamedAddresses_0= ruleNamedAddresses
                    {
                     
                            newCompositeNode(grammarAccess.getConstructorAddressParametersAccess().getNamedAddressesParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamedAddresses_in_ruleConstructorAddressParameters615);
                    this_NamedAddresses_0=ruleNamedAddresses();

                    state._fsp--;

                     
                            current = this_NamedAddresses_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:332:5: this_AddressTuple_1= ruleAddressTuple
                    {
                     
                            newCompositeNode(grammarAccess.getConstructorAddressParametersAccess().getAddressTupleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressTuple_in_ruleConstructorAddressParameters642);
                    this_AddressTuple_1=ruleAddressTuple();

                    state._fsp--;

                     
                            current = this_AddressTuple_1; 
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
    // $ANTLR end "ruleConstructorAddressParameters"


    // $ANTLR start "entryRuleNamedAddresses"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:348:1: entryRuleNamedAddresses returns [EObject current=null] : iv_ruleNamedAddresses= ruleNamedAddresses EOF ;
    public final EObject entryRuleNamedAddresses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedAddresses = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:349:2: (iv_ruleNamedAddresses= ruleNamedAddresses EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:350:2: iv_ruleNamedAddresses= ruleNamedAddresses EOF
            {
             newCompositeNode(grammarAccess.getNamedAddressesRule()); 
            pushFollow(FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses677);
            iv_ruleNamedAddresses=ruleNamedAddresses();

            state._fsp--;

             current =iv_ruleNamedAddresses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddresses687); 

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
    // $ANTLR end "entryRuleNamedAddresses"


    // $ANTLR start "ruleNamedAddresses"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:357:1: ruleNamedAddresses returns [EObject current=null] : (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleNamedAddresses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_addressNames_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_addressNames_4_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:360:28: ( (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:361:1: (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:361:1: (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:361:3: otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleNamedAddresses724); 

                	newLeafNode(otherlv_0, grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:365:1: ( (lv_addressNames_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:366:1: (lv_addressNames_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:366:1: (lv_addressNames_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:367:3: lv_addressNames_1_0= RULE_ID
            {
            lv_addressNames_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddresses741); 

            			newLeafNode(lv_addressNames_1_0, grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNamedAddressesRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"addressNames",
                    		lv_addressNames_1_0, 
                    		"ID");
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:383:2: (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:383:4: otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleNamedAddresses759); 

            	        	newLeafNode(otherlv_2, grammarAccess.getNamedAddressesAccess().getCommaKeyword_2_0());
            	        
            	    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleNamedAddresses771); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_2_1());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:391:1: ( (lv_addressNames_4_0= RULE_ID ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:392:1: (lv_addressNames_4_0= RULE_ID )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:392:1: (lv_addressNames_4_0= RULE_ID )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:393:3: lv_addressNames_4_0= RULE_ID
            	    {
            	    lv_addressNames_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddresses788); 

            	    			newLeafNode(lv_addressNames_4_0, grammarAccess.getNamedAddressesAccess().getAddressNamesIDTerminalRuleCall_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNamedAddressesRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"addressNames",
            	            		lv_addressNames_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleNamedAddresses"


    // $ANTLR start "entryRuleAddressTuple"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:417:1: entryRuleAddressTuple returns [EObject current=null] : iv_ruleAddressTuple= ruleAddressTuple EOF ;
    public final EObject entryRuleAddressTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressTuple = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:418:2: (iv_ruleAddressTuple= ruleAddressTuple EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:419:2: iv_ruleAddressTuple= ruleAddressTuple EOF
            {
             newCompositeNode(grammarAccess.getAddressTupleRule()); 
            pushFollow(FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple831);
            iv_ruleAddressTuple=ruleAddressTuple();

            state._fsp--;

             current =iv_ruleAddressTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressTuple841); 

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
    // $ANTLR end "entryRuleAddressTuple"


    // $ANTLR start "ruleAddressTuple"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:426:1: ruleAddressTuple returns [EObject current=null] : (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleAddressTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_elements_2_0=null;
        Token otherlv_3=null;
        Token lv_elements_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:429:28: ( (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:430:1: (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:430:1: (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:430:3: otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAddressTuple878); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressTupleAccess().getCommercialAtKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleAddressTuple890); 

                	newLeafNode(otherlv_1, grammarAccess.getAddressTupleAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:438:1: ( (lv_elements_2_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:439:1: (lv_elements_2_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:439:1: (lv_elements_2_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:440:3: lv_elements_2_0= RULE_ID
            {
            lv_elements_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressTuple907); 

            			newLeafNode(lv_elements_2_0, grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressTupleRule());
            	        }
                   		addWithLastConsumed(
                   			current, 
                   			"elements",
                    		lv_elements_2_0, 
                    		"ID");
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:456:2: (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:456:4: otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleAddressTuple925); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAddressTupleAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:460:1: ( (lv_elements_4_0= RULE_ID ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:461:1: (lv_elements_4_0= RULE_ID )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:461:1: (lv_elements_4_0= RULE_ID )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:462:3: lv_elements_4_0= RULE_ID
            	    {
            	    lv_elements_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressTuple942); 

            	    			newLeafNode(lv_elements_4_0, grammarAccess.getAddressTupleAccess().getElementsIDTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAddressTupleRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"elements",
            	            		lv_elements_4_0, 
            	            		"ID");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleAddressTuple961); 

                	newLeafNode(otherlv_5, grammarAccess.getAddressTupleAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleAddressTuple"


    // $ANTLR start "entryRuleMember"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:490:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:491:2: (iv_ruleMember= ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:492:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember997);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember1007); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:499:1: ruleMember returns [EObject current=null] : (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_LinkBinding_0 = null;

        EObject this_Expansion_1 = null;

        EObject this_Instantiation_2 = null;

        EObject this_Grouping_3 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:502:28: ( (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:503:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:503:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==25) ) {
                    alt11=4;
                }
                else if ( (LA11_2==19) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==RULE_ID) ) {
                    int LA11_6 = input.LA(3);

                    if ( (LA11_6==25) ) {
                        alt11=3;
                    }
                    else if ( (LA11_6==19) ) {
                        int LA11_8 = input.LA(4);

                        if ( (LA11_8==RULE_ID) ) {
                            alt11=2;
                        }
                        else if ( ((LA11_8>=29 && LA11_8<=30)) ) {
                            alt11=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 8, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 6, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:504:5: this_LinkBinding_0= ruleLinkBinding
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinkBinding_in_ruleMember1054);
                    this_LinkBinding_0=ruleLinkBinding();

                    state._fsp--;

                     
                            current = this_LinkBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:514:5: this_Expansion_1= ruleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpansion_in_ruleMember1081);
                    this_Expansion_1=ruleExpansion();

                    state._fsp--;

                     
                            current = this_Expansion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:524:5: this_Instantiation_2= ruleInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleMember1108);
                    this_Instantiation_2=ruleInstantiation();

                    state._fsp--;

                     
                            current = this_Instantiation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:534:5: this_Grouping_3= ruleGrouping
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGrouping_in_ruleMember1135);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:550:1: entryRuleLinkBinding returns [EObject current=null] : iv_ruleLinkBinding= ruleLinkBinding EOF ;
    public final EObject entryRuleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:551:2: (iv_ruleLinkBinding= ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:552:2: iv_ruleLinkBinding= ruleLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding1170);
            iv_ruleLinkBinding=ruleLinkBinding();

            state._fsp--;

             current =iv_ruleLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding1180); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:559:1: ruleLinkBinding returns [EObject current=null] : this_TosNetLinkBinding_0= ruleTosNetLinkBinding ;
    public final EObject ruleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject this_TosNetLinkBinding_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:562:28: (this_TosNetLinkBinding_0= ruleTosNetLinkBinding )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:564:5: this_TosNetLinkBinding_0= ruleTosNetLinkBinding
            {
             
                    newCompositeNode(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding1226);
            this_TosNetLinkBinding_0=ruleTosNetLinkBinding();

            state._fsp--;

             
                    current = this_TosNetLinkBinding_0; 
                    afterParserOrEnumRuleCall();
                

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


    // $ANTLR start "entryRuleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:1: entryRuleTosNetLinkBinding returns [EObject current=null] : iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF ;
    public final EObject entryRuleTosNetLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTosNetLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:581:2: (iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:582:2: iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getTosNetLinkBindingRule()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding1260);
            iv_ruleTosNetLinkBinding=ruleTosNetLinkBinding();

            state._fsp--;

             current =iv_ruleTosNetLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTosNetLinkBinding1270); 

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
    // $ANTLR end "entryRuleTosNetLinkBinding"


    // $ANTLR start "ruleTosNetLinkBinding"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:589:1: ruleTosNetLinkBinding returns [EObject current=null] : (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleTosNetLinkBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_properties_2_0 = null;

        EObject lv_properties_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:592:28: ( (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:593:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:593:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:593:3: otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTosNetLinkBinding1307); 

                	newLeafNode(otherlv_0, grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0());
                
            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTosNetLinkBinding1319); 

                	newLeafNode(otherlv_1, grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:601:1: ( (lv_properties_2_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:602:1: (lv_properties_2_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:602:1: (lv_properties_2_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:603:3: lv_properties_2_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1340);
            lv_properties_2_0=ruleLinkProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTosNetLinkBindingRule());
            	        }
                   		add(
                   			current, 
                   			"properties",
                    		lv_properties_2_0, 
                    		"LinkProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:619:2: (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:619:4: otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTosNetLinkBinding1353); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:623:1: ( (lv_properties_4_0= ruleLinkProperty ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:624:1: (lv_properties_4_0= ruleLinkProperty )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:624:1: (lv_properties_4_0= ruleLinkProperty )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:625:3: lv_properties_4_0= ruleLinkProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1374);
            	    lv_properties_4_0=ruleLinkProperty();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTosNetLinkBindingRule());
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
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTosNetLinkBinding1388); 

                	newLeafNode(otherlv_5, grammarAccess.getTosNetLinkBindingAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleTosNetLinkBinding"


    // $ANTLR start "entryRuleLinkProperty"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:653:1: entryRuleLinkProperty returns [EObject current=null] : iv_ruleLinkProperty= ruleLinkProperty EOF ;
    public final EObject entryRuleLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:654:2: (iv_ruleLinkProperty= ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:655:2: iv_ruleLinkProperty= ruleLinkProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1424);
            iv_ruleLinkProperty=ruleLinkProperty();

            state._fsp--;

             current =iv_ruleLinkProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty1434); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:662:1: ruleLinkProperty returns [EObject current=null] : ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleLinkProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ctrlName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_baseValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_uartName_8_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:665:28: ( ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:666:1: ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:666:1: ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:666:2: (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:666:2: (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:666:4: otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1472); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleLinkProperty1484); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:674:1: ( (lv_ctrlName_2_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:675:1: (lv_ctrlName_2_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:675:1: (lv_ctrlName_2_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:676:3: lv_ctrlName_2_0= RULE_ID
                    {
                    lv_ctrlName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1501); 

                    			newLeafNode(lv_ctrlName_2_0, grammarAccess.getLinkPropertyAccess().getCtrlNameIDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ctrlName",
                            		lv_ctrlName_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:693:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:693:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:693:8: otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleLinkProperty1526); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleLinkProperty1538); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:701:1: ( (lv_baseValue_5_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:702:1: (lv_baseValue_5_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:702:1: (lv_baseValue_5_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:703:3: lv_baseValue_5_0= RULE_INT
                    {
                    lv_baseValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLinkProperty1555); 

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
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:720:6: (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:720:6: (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:720:8: otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleLinkProperty1580); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkPropertyAccess().getUARTKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleLinkProperty1592); 

                        	newLeafNode(otherlv_7, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:728:1: ( (lv_uartName_8_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:729:1: (lv_uartName_8_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:729:1: (lv_uartName_8_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:730:3: lv_uartName_8_0= RULE_ID
                    {
                    lv_uartName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1609); 

                    			newLeafNode(lv_uartName_8_0, grammarAccess.getLinkPropertyAccess().getUartNameIDTerminalRuleCall_2_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLinkPropertyRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"uartName",
                            		lv_uartName_8_0, 
                            		"ID");
                    	    

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:754:1: entryRuleExpansion returns [EObject current=null] : iv_ruleExpansion= ruleExpansion EOF ;
    public final EObject entryRuleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:755:2: (iv_ruleExpansion= ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:756:2: iv_ruleExpansion= ruleExpansion EOF
            {
             newCompositeNode(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion1651);
            iv_ruleExpansion=ruleExpansion();

            state._fsp--;

             current =iv_ruleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion1661); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:763:1: ruleExpansion returns [EObject current=null] : (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion ) ;
    public final EObject ruleExpansion() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpansion_0 = null;

        EObject this_AddressExpansion_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:766:28: ( (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:767:1: (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:767:1: (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==22) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:768:5: this_SimpleExpansion_0= ruleSimpleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleExpansion_in_ruleExpansion1708);
                    this_SimpleExpansion_0=ruleSimpleExpansion();

                    state._fsp--;

                     
                            current = this_SimpleExpansion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:778:5: this_AddressExpansion_1= ruleAddressExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressExpansion_in_ruleExpansion1735);
                    this_AddressExpansion_1=ruleAddressExpansion();

                    state._fsp--;

                     
                            current = this_AddressExpansion_1; 
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
    // $ANTLR end "ruleExpansion"


    // $ANTLR start "entryRuleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:794:1: entryRuleSimpleExpansion returns [EObject current=null] : iv_ruleSimpleExpansion= ruleSimpleExpansion EOF ;
    public final EObject entryRuleSimpleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:795:2: (iv_ruleSimpleExpansion= ruleSimpleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:796:2: iv_ruleSimpleExpansion= ruleSimpleExpansion EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpansionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion1770);
            iv_ruleSimpleExpansion=ruleSimpleExpansion();

            state._fsp--;

             current =iv_ruleSimpleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansion1780); 

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
    // $ANTLR end "entryRuleSimpleExpansion"


    // $ANTLR start "ruleSimpleExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:803:1: ruleSimpleExpansion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) ;
    public final EObject ruleSimpleExpansion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_arguments_4_0 = null;

        EObject lv_arguments_6_0 = null;

        EObject lv_bindings_8_0 = null;

        EObject lv_bindings_10_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:806:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:807:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:807:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:807:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:807:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:808:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:808:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:809:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansion1822); 

            			newLeafNode(lv_name_0_0, grammarAccess.getSimpleExpansionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleExpansionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleSimpleExpansion1839); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleExpansionAccess().getColonKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:829:1: ( (otherlv_2= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:830:1: (otherlv_2= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:830:1: (otherlv_2= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:831:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleExpansionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansion1859); 

            		newLeafNode(otherlv_2, grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSimpleExpansion1871); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:846:1: ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:846:2: ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:846:2: ( (lv_arguments_4_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:847:1: (lv_arguments_4_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:847:1: (lv_arguments_4_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:848:3: lv_arguments_4_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleSimpleExpansion1893);
                    lv_arguments_4_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_4_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==17) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:864:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleSimpleExpansion1906); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:868:1: ( (lv_arguments_6_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:869:1: (lv_arguments_6_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:869:1: (lv_arguments_6_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:870:3: lv_arguments_6_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleSimpleExpansion1927);
                    	    lv_arguments_6_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
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
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleSimpleExpansion1943); 

                	newLeafNode(otherlv_7, grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:890:1: ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:890:2: ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:890:2: ( (lv_bindings_8_0= ruleAddressBinding ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:891:1: (lv_bindings_8_0= ruleAddressBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:891:1: (lv_bindings_8_0= ruleAddressBinding )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:892:3: lv_bindings_8_0= ruleAddressBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1965);
                    lv_bindings_8_0=ruleAddressBinding();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"bindings",
                            		lv_bindings_8_0, 
                            		"AddressBinding");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:908:2: (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==17) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:908:4: otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleSimpleExpansion1978); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:912:1: ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:913:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:913:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:914:3: lv_bindings_10_0= ruleAddressBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1999);
                    	    lv_bindings_10_0=ruleAddressBinding();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSimpleExpansionRule());
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
                    	    break loop17;
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
    // $ANTLR end "ruleSimpleExpansion"


    // $ANTLR start "entryRuleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:938:1: entryRuleAddressExpansion returns [EObject current=null] : iv_ruleAddressExpansion= ruleAddressExpansion EOF ;
    public final EObject entryRuleAddressExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:939:2: (iv_ruleAddressExpansion= ruleAddressExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:940:2: iv_ruleAddressExpansion= ruleAddressExpansion EOF
            {
             newCompositeNode(grammarAccess.getAddressExpansionRule()); 
            pushFollow(FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion2039);
            iv_ruleAddressExpansion=ruleAddressExpansion();

            state._fsp--;

             current =iv_ruleAddressExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansion2049); 

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
    // $ANTLR end "entryRuleAddressExpansion"


    // $ANTLR start "ruleAddressExpansion"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:947:1: ruleAddressExpansion returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' ) ;
    public final EObject ruleAddressExpansion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_arguments_5_0 = null;

        EObject lv_arguments_7_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:950:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:951:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:951:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:951:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAddressExpansion2086); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:955:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:956:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:956:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:957:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansion2103); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAddressExpansionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressExpansionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleAddressExpansion2120); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressExpansionAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:977:1: ( (otherlv_3= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:978:1: (otherlv_3= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:978:1: (otherlv_3= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:979:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressExpansionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansion2140); 

            		newLeafNode(otherlv_3, grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleAddressExpansion2152); 

                	newLeafNode(otherlv_4, grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:1: ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:2: ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:2: ( (lv_arguments_5_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:1: (lv_arguments_5_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:1: (lv_arguments_5_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:996:3: lv_arguments_5_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleAddressExpansion2174);
                    lv_arguments_5_0=ruleArgument();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAddressExpansionRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_5_0, 
                            		"Argument");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1012:2: (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1012:4: otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleAddressExpansion2187); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1016:1: ( (lv_arguments_7_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1017:1: (lv_arguments_7_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1017:1: (lv_arguments_7_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1018:3: lv_arguments_7_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleAddressExpansion2208);
                    	    lv_arguments_7_0=ruleArgument();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAddressExpansionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_7_0, 
                    	            		"Argument");
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

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleAddressExpansion2224); 

                	newLeafNode(otherlv_8, grammarAccess.getAddressExpansionAccess().getRightParenthesisKeyword_6());
                

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
    // $ANTLR end "ruleAddressExpansion"


    // $ANTLR start "entryRuleArgument"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1046:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1047:2: (iv_ruleArgument= ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1048:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument2260);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument2270); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1055:1: ruleArgument returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token lv_lhs_1_0=null;
        Token otherlv_2=null;
        Token lv_text_4_0=null;
        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1058:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1059:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1059:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==EOF||(LA21_1>=17 && LA21_1<=18)) ) {
                    alt21=1;
                }
                else if ( (LA21_1==28) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1059:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1059:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1060:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1060:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1061:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2312); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:7: ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:7: ( (lv_lhs_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1079:1: (lv_lhs_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1079:1: (lv_lhs_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1080:3: lv_lhs_1_0= RULE_ID
                    {
                    lv_lhs_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2341); 

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

                    otherlv_2=(Token)match(input,28,FOLLOW_28_in_ruleArgument2358); 

                        	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1100:1: ( (lv_rhs_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1101:1: (lv_rhs_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1101:1: (lv_rhs_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1102:3: lv_rhs_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleArgument2379);
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1119:6: ( (lv_text_4_0= RULE_STRING ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1119:6: ( (lv_text_4_0= RULE_STRING ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1120:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1120:1: (lv_text_4_0= RULE_STRING )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1121:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument2403); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1145:1: entryRuleAddressBinding returns [EObject current=null] : iv_ruleAddressBinding= ruleAddressBinding EOF ;
    public final EObject entryRuleAddressBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1146:2: (iv_ruleAddressBinding= ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1147:2: iv_ruleAddressBinding= ruleAddressBinding EOF
            {
             newCompositeNode(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding2444);
            iv_ruleAddressBinding=ruleAddressBinding();

            state._fsp--;

             current =iv_ruleAddressBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding2454); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1154:1: ruleAddressBinding returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1157:28: ( (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1158:1: (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1158:1: (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1158:3: otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAddressBinding2491); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1162:1: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1162:2: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1162:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1163:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1163:1: (lv_name_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1164:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressBinding2509); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getAddressBindingAccess().getNameIDTerminalRuleCall_1_0_0()); 
                    		

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

                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAddressBinding2526); 

                        	newLeafNode(otherlv_2, grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAddressBinding2540); 

                	newLeafNode(otherlv_3, grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1188:1: ( (lv_addresses_4_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1189:1: (lv_addresses_4_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1189:1: (lv_addresses_4_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1190:3: lv_addresses_4_0= RULE_HEX_NUM
            {
            lv_addresses_4_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2557); 

            			newLeafNode(lv_addresses_4_0, grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_3_0()); 
            		

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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1206:2: (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==17) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1206:4: otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleAddressBinding2575); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAddressBindingAccess().getCommaKeyword_4_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1210:1: ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1211:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1211:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1212:3: lv_addresses_6_0= RULE_HEX_NUM
            	    {
            	    lv_addresses_6_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2592); 

            	    			newLeafNode(lv_addresses_6_0, grammarAccess.getAddressBindingAccess().getAddressesHEX_NUMTerminalRuleCall_4_1_0()); 
            	    		

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
            	    break loop23;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleAddressBinding2611); 

                	newLeafNode(otherlv_7, grammarAccess.getAddressBindingAccess().getRightParenthesisKeyword_5());
                

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1240:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1241:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1242:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation2647);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation2657); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1249:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1252:28: ( (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1253:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1253:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1253:3: otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInstantiation2694); 

                	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1257:1: ( (lv_address_1_0= ruleAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1258:1: (lv_address_1_0= ruleAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1258:1: (lv_address_1_0= ruleAddressSpec )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1259:3: lv_address_1_0= ruleAddressSpec
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAddressSpec_in_ruleInstantiation2715);
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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleInstantiation2727); 

                	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1279:1: ( (lv_kind_3_0= ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1280:1: (lv_kind_3_0= ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1280:1: (lv_kind_3_0= ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1281:3: lv_kind_3_0= ruleKind
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleKind_in_ruleInstantiation2748);
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

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleInstantiation2760); 

                	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1301:1: ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=31 && LA25_0<=33)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1301:2: ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1301:2: ( (lv_properties_5_0= ruleInstantiationProperty ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1302:1: (lv_properties_5_0= ruleInstantiationProperty )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1302:1: (lv_properties_5_0= ruleInstantiationProperty )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1303:3: lv_properties_5_0= ruleInstantiationProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2782);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1319:2: (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1319:4: otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleInstantiation2795); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1323:1: ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1324:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1324:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1325:3: lv_properties_7_0= ruleInstantiationProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2816);
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
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleInstantiation2832); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1353:1: entryRuleAddressSpec returns [EObject current=null] : iv_ruleAddressSpec= ruleAddressSpec EOF ;
    public final EObject entryRuleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1354:2: (iv_ruleAddressSpec= ruleAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1355:2: iv_ruleAddressSpec= ruleAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getAddressSpecRule()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2868);
            iv_ruleAddressSpec=ruleAddressSpec();

            state._fsp--;

             current =iv_ruleAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressSpec2878); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1362:1: ruleAddressSpec returns [EObject current=null] : (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) ;
    public final EObject ruleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject this_DirectAddressSpec_0 = null;

        EObject this_NamedAddressSpec_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1365:28: ( (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1366:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1366:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==EOF||LA26_1==19) ) {
                    alt26=2;
                }
                else if ( (LA26_1==25) ) {
                    alt26=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1367:5: this_DirectAddressSpec_0= ruleDirectAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2925);
                    this_DirectAddressSpec_0=ruleDirectAddressSpec();

                    state._fsp--;

                     
                            current = this_DirectAddressSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1377:5: this_NamedAddressSpec_1= ruleNamedAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2952);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1393:1: entryRuleDirectAddressSpec returns [EObject current=null] : iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF ;
    public final EObject entryRuleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1394:2: (iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1395:2: iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getDirectAddressSpecRule()); 
            pushFollow(FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2987);
            iv_ruleDirectAddressSpec=ruleDirectAddressSpec();

            state._fsp--;

             current =iv_ruleDirectAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectAddressSpec2997); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1402:1: ruleDirectAddressSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) ;
    public final EObject ruleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_address_2_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1405:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1406:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1406:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1406:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1407:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1407:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1408:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectAddressSpec3039); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleDirectAddressSpec3056); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1428:1: ( (lv_address_2_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1429:1: (lv_address_2_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1429:1: (lv_address_2_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1430:3: lv_address_2_0= RULE_HEX_NUM
            {
            lv_address_2_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec3073); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1454:1: entryRuleNamedAddressSpec returns [EObject current=null] : iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF ;
    public final EObject entryRuleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1455:2: (iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1456:2: iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getNamedAddressSpecRule()); 
            pushFollow(FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec3114);
            iv_ruleNamedAddressSpec=ruleNamedAddressSpec();

            state._fsp--;

             current =iv_ruleNamedAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddressSpec3124); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1463:1: ruleNamedAddressSpec returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1466:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1467:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1467:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1468:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1469:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddressSpec3165); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1493:1: entryRuleKind returns [String current=null] : iv_ruleKind= ruleKind EOF ;
    public final String entryRuleKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKind = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1494:2: (iv_ruleKind= ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1495:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind3206);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind3217); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1502:1: ruleKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1505:28: ( (kw= 'READ' | kw= 'WRITE' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1506:1: (kw= 'READ' | kw= 'WRITE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1506:1: (kw= 'READ' | kw= 'WRITE' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            else if ( (LA27_0==30) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1507:2: kw= 'READ'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleKind3255); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1514:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleKind3274); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1527:1: entryRuleInstantiationProperty returns [EObject current=null] : iv_ruleInstantiationProperty= ruleInstantiationProperty EOF ;
    public final EObject entryRuleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1528:2: (iv_ruleInstantiationProperty= ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1529:2: iv_ruleInstantiationProperty= ruleInstantiationProperty EOF
            {
             newCompositeNode(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty3314);
            iv_ruleInstantiationProperty=ruleInstantiationProperty();

            state._fsp--;

             current =iv_ruleInstantiationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty3324); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1536:1: ruleInstantiationProperty returns [EObject current=null] : ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1539:28: ( ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt28=1;
                }
                break;
            case 32:
                {
                alt28=2;
                }
                break;
            case 33:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:3: () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1540:3: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1541:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleInstantiationProperty3371); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleInstantiationProperty3383); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1554:1: ( (lv_id_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1555:1: (lv_id_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1555:1: (lv_id_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1556:3: lv_id_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleInstantiationProperty3404);
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1573:6: ( () otherlv_5= 'CRC' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1573:6: ( () otherlv_5= 'CRC' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1573:7: () otherlv_5= 'CRC'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1573:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1574:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleInstantiationProperty3433); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1584:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1584:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1584:7: () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1584:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1585:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getPublishPropertyAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,33,FOLLOW_33_in_ruleInstantiationProperty3462); 

                        	newLeafNode(otherlv_7, grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1());
                        
                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleInstantiationProperty3474); 

                        	newLeafNode(otherlv_8, grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1598:1: ( (lv_mode_9_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1599:1: (lv_mode_9_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1599:1: (lv_mode_9_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1600:3: lv_mode_9_0= RULE_INT
                    {
                    lv_mode_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3491); 

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

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleInstantiationProperty3508); 

                        	newLeafNode(otherlv_10, grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1620:1: ( (lv_rate_11_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1621:1: (lv_rate_11_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1621:1: (lv_rate_11_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1622:3: lv_rate_11_0= RULE_INT
                    {
                    lv_rate_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3525); 

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

                    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleInstantiationProperty3542); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1650:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1651:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1652:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping3579);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping3589); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1659:1: ruleGrouping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1662:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1663:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1663:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1663:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1663:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1664:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1664:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1665:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrouping3631); 

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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleGrouping3648); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupingAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1685:1: ( (lv_elements_2_0= ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1686:1: (lv_elements_2_0= ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1686:1: (lv_elements_2_0= ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1687:3: lv_elements_2_0= ruleGroupElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3669);
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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1703:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==17) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1703:4: otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleGrouping3682); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupingAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1707:1: ( (lv_elements_4_0= ruleGroupElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1708:1: (lv_elements_4_0= ruleGroupElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1708:1: (lv_elements_4_0= ruleGroupElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1709:3: lv_elements_4_0= ruleGroupElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3703);
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
            	    break loop29;
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1733:1: entryRuleGroupElement returns [EObject current=null] : iv_ruleGroupElement= ruleGroupElement EOF ;
    public final EObject entryRuleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1734:2: (iv_ruleGroupElement= ruleGroupElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1735:2: iv_ruleGroupElement= ruleGroupElement EOF
            {
             newCompositeNode(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement3741);
            iv_ruleGroupElement=ruleGroupElement();

            state._fsp--;

             current =iv_ruleGroupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement3751); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1742:1: ruleGroupElement returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) ;
    public final EObject ruleGroupElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1745:28: ( ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1746:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1746:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1746:2: ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1746:2: ( (lv_path_0_0= rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1747:1: (lv_path_0_0= rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1747:1: (lv_path_0_0= rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1748:3: lv_path_0_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3797);
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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1764:2: (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==13) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1764:4: otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) )
            	    {
            	    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGroupElement3810); 

            	        	newLeafNode(otherlv_1, grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1768:1: ( (lv_path_2_0= rulePathElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1769:1: (lv_path_2_0= rulePathElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1769:1: (lv_path_2_0= rulePathElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1770:3: lv_path_2_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3831);
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
            	    break loop30;
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1794:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1795:2: (iv_rulePathElement= rulePathElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1796:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement3869);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement3879); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1803:1: rulePathElement returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1806:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1807:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1807:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            else if ( (LA31_0==34) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1807:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1807:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1808:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1808:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1809:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3921); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1826:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1826:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1826:8: otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePathElement3945); 

                        	newLeafNode(otherlv_1, grammarAccess.getPathElementAccess().getALLKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_rulePathElement3957); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1834:1: ( (otherlv_3= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1835:1: (otherlv_3= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1835:1: (otherlv_3= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1836:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathElementRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3977); 

                    		newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_rulePathElement3989); 

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


 

    public static final BitSet FOLLOW_ruleLinkSpec_in_entryRuleLinkSpec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkSpec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleLinkSpec122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkSpec140 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLinkSpec157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkSpec176 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLinkSpec193 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleLinkSpec214 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleConstructor304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor335 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleConstructor352 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor370 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleConstructor388 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor405 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleConstructor426 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleConstructor439 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_ruleConstructor460 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleConstructor474 = new BitSet(new long[]{0x0000000000E00010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleConstructor496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleConstructor508 = new BitSet(new long[]{0x0000000000E00010L});
    public static final BitSet FOLLOW_21_in_ruleConstructor522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorAddressParameters568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_ruleConstructorAddressParameters615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_ruleConstructorAddressParameters642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddresses687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleNamedAddresses724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddresses741 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleNamedAddresses759 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNamedAddresses771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddresses788 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressTuple841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAddressTuple878 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAddressTuple890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressTuple907 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleAddressTuple925 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressTuple942 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleAddressTuple961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_ruleMember1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_ruleMember1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleMember1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleMember1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTosNetLinkBinding1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTosNetLinkBinding1307 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTosNetLinkBinding1319 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1340 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleTosNetLinkBinding1353 = new BitSet(new long[]{0x000000000D000000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1374 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleTosNetLinkBinding1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1472 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLinkProperty1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLinkProperty1526 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLinkProperty1538 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLinkProperty1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLinkProperty1580 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLinkProperty1592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion1651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_ruleExpansion1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_ruleExpansion1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion1770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansion1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansion1822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSimpleExpansion1839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansion1859 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSimpleExpansion1871 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleSimpleExpansion1893 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleExpansion1906 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleSimpleExpansion1927 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleSimpleExpansion1943 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1965 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleSimpleExpansion1978 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1999 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion2039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansion2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAddressExpansion2086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansion2103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAddressExpansion2120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansion2140 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAddressExpansion2152 = new BitSet(new long[]{0x0000000000040050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAddressExpansion2174 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleAddressExpansion2187 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAddressExpansion2208 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleAddressExpansion2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument2260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2341 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleArgument2358 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding2444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAddressBinding2491 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressBinding2509 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAddressBinding2526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAddressBinding2540 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2557 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleAddressBinding2575 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2592 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleAddressBinding2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation2647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInstantiation2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_ruleInstantiation2715 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleInstantiation2727 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleKind_in_ruleInstantiation2748 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiation2760 = new BitSet(new long[]{0x0000000380040000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2782 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleInstantiation2795 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2816 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleInstantiation2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressSpec2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectAddressSpec2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectAddressSpec3039 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleDirectAddressSpec3056 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec3073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec3114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddressSpec3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddressSpec3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind3206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind3217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKind3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleKind3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty3314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInstantiationProperty3371 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleInstantiationProperty3383 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleInstantiationProperty3404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInstantiationProperty3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInstantiationProperty3462 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiationProperty3474 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3491 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInstantiationProperty3508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3525 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInstantiationProperty3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping3579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrouping3631 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGrouping3648 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3669 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleGrouping3682 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3703 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement3741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3797 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleGroupElement3810 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3831 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement3869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePathElement3945 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePathElement3957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3977 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePathElement3989 = new BitSet(new long[]{0x0000000000000002L});

}