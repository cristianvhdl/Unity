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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_HEX_NUM", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'link'", "';'", "'public'", "'('", "','", "')'", "':'", "'{'", "'}'", "'@'", "'TOSNET'", "'CTRL'", "'='", "'BASE'", "'UART'", "'+'", "'READ'", "'WRITE'", "'ID'", "'CRC'", "'PUBLISH'", "'.'", "'ALL'"
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:76:1: ruleLinkSpec returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* ) ;
    public final EObject ruleLinkSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_constructors_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:79:28: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:80:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ( (lv_constructors_3_0= ruleConstructor ) )*
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleLinkSpec122); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkSpecAccess().getLinkKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:85:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkSpec139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLinkSpecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLinkSpec156); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkSpecAccess().getSemicolonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:106:1: ( (lv_constructors_3_0= ruleConstructor ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:1: (lv_constructors_3_0= ruleConstructor )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:107:1: (lv_constructors_3_0= ruleConstructor )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:108:3: lv_constructors_3_0= ruleConstructor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLinkSpecAccess().getConstructorsConstructorParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleConstructor_in_ruleLinkSpec177);
            	    lv_constructors_3_0=ruleConstructor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLinkSpecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"constructors",
            	            		lv_constructors_3_0, 
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:132:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:133:2: (iv_ruleConstructor= ruleConstructor EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:134:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_ruleConstructor_in_entryRuleConstructor214);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructor224); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:141:1: ruleConstructor returns [EObject current=null] : ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:144:28: ( ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:1: ( ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:2: ( (lv_isPublic_0_0= 'public' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )? otherlv_6= ')' (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )? otherlv_9= '{' ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )* otherlv_12= '}'
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:145:2: ( (lv_isPublic_0_0= 'public' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:146:1: (lv_isPublic_0_0= 'public' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:146:1: (lv_isPublic_0_0= 'public' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:147:3: lv_isPublic_0_0= 'public'
                    {
                    lv_isPublic_0_0=(Token)match(input,14,FOLLOW_14_in_ruleConstructor267); 

                            newLeafNode(lv_isPublic_0_0, grammarAccess.getConstructorAccess().getIsPublicPublicKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstructorRule());
                    	        }
                           		setWithLastConsumed(current, "isPublic", true, "public");
                    	    

                    }


                    }
                    break;

            }

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:160:3: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:161:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:161:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:162:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor298); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleConstructor315); 

                	newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getLeftParenthesisKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:1: ( ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:2: ( (lv_parameters_3_0= RULE_ID ) ) (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:182:2: ( (lv_parameters_3_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:183:1: (lv_parameters_3_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:183:1: (lv_parameters_3_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:184:3: lv_parameters_3_0= RULE_ID
                    {
                    lv_parameters_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor333); 

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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:200:2: (otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:200:4: otherlv_4= ',' ( (lv_parameters_5_0= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleConstructor351); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getCommaKeyword_3_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:204:1: ( (lv_parameters_5_0= RULE_ID ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_parameters_5_0= RULE_ID )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:205:1: (lv_parameters_5_0= RULE_ID )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:206:3: lv_parameters_5_0= RULE_ID
                    	    {
                    	    lv_parameters_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstructor368); 

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

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleConstructor389); 

                	newLeafNode(otherlv_6, grammarAccess.getConstructorAccess().getRightParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:226:1: (otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:226:3: otherlv_7= ':' ( (lv_addresses_8_0= ruleConstructorAddressParameters ) )
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleConstructor402); 

                        	newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getColonKeyword_5_0());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:230:1: ( (lv_addresses_8_0= ruleConstructorAddressParameters ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:231:1: (lv_addresses_8_0= ruleConstructorAddressParameters )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:231:1: (lv_addresses_8_0= ruleConstructorAddressParameters )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:232:3: lv_addresses_8_0= ruleConstructorAddressParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstructorAccess().getAddressesConstructorAddressParametersParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConstructorAddressParameters_in_ruleConstructor423);
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

            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleConstructor437); 

                	newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getLeftCurlyBracketKeyword_6());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:252:1: ( ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=21 && LA6_0<=22)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:252:2: ( (lv_members_10_0= ruleMember ) ) otherlv_11= ';'
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:252:2: ( (lv_members_10_0= ruleMember ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:253:1: (lv_members_10_0= ruleMember )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:253:1: (lv_members_10_0= ruleMember )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:254:3: lv_members_10_0= ruleMember
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getConstructorAccess().getMembersMemberParserRuleCall_7_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMember_in_ruleConstructor459);
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

            	    otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleConstructor471); 

            	        	newLeafNode(otherlv_11, grammarAccess.getConstructorAccess().getSemicolonKeyword_7_1());
            	        

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleConstructor485); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:286:1: entryRuleConstructorAddressParameters returns [EObject current=null] : iv_ruleConstructorAddressParameters= ruleConstructorAddressParameters EOF ;
    public final EObject entryRuleConstructorAddressParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorAddressParameters = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:287:2: (iv_ruleConstructorAddressParameters= ruleConstructorAddressParameters EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:288:2: iv_ruleConstructorAddressParameters= ruleConstructorAddressParameters EOF
            {
             newCompositeNode(grammarAccess.getConstructorAddressParametersRule()); 
            pushFollow(FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters521);
            iv_ruleConstructorAddressParameters=ruleConstructorAddressParameters();

            state._fsp--;

             current =iv_ruleConstructorAddressParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstructorAddressParameters531); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:295:1: ruleConstructorAddressParameters returns [EObject current=null] : (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple ) ;
    public final EObject ruleConstructorAddressParameters() throws RecognitionException {
        EObject current = null;

        EObject this_NamedAddresses_0 = null;

        EObject this_AddressTuple_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:298:28: ( (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:299:1: (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:299:1: (this_NamedAddresses_0= ruleNamedAddresses | this_AddressTuple_1= ruleAddressTuple )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else if ( (LA7_1==15) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:300:5: this_NamedAddresses_0= ruleNamedAddresses
                    {
                     
                            newCompositeNode(grammarAccess.getConstructorAddressParametersAccess().getNamedAddressesParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNamedAddresses_in_ruleConstructorAddressParameters578);
                    this_NamedAddresses_0=ruleNamedAddresses();

                    state._fsp--;

                     
                            current = this_NamedAddresses_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:310:5: this_AddressTuple_1= ruleAddressTuple
                    {
                     
                            newCompositeNode(grammarAccess.getConstructorAddressParametersAccess().getAddressTupleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressTuple_in_ruleConstructorAddressParameters605);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:326:1: entryRuleNamedAddresses returns [EObject current=null] : iv_ruleNamedAddresses= ruleNamedAddresses EOF ;
    public final EObject entryRuleNamedAddresses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedAddresses = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:327:2: (iv_ruleNamedAddresses= ruleNamedAddresses EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:328:2: iv_ruleNamedAddresses= ruleNamedAddresses EOF
            {
             newCompositeNode(grammarAccess.getNamedAddressesRule()); 
            pushFollow(FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses640);
            iv_ruleNamedAddresses=ruleNamedAddresses();

            state._fsp--;

             current =iv_ruleNamedAddresses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddresses650); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:335:1: ruleNamedAddresses returns [EObject current=null] : (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* ) ;
    public final EObject ruleNamedAddresses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_addressNames_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_addressNames_4_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:338:28: ( (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:339:1: (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:339:1: (otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:339:3: otherlv_0= '@' ( (lv_addressNames_1_0= RULE_ID ) ) (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNamedAddresses687); 

                	newLeafNode(otherlv_0, grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:343:1: ( (lv_addressNames_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:1: (lv_addressNames_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:344:1: (lv_addressNames_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:345:3: lv_addressNames_1_0= RULE_ID
            {
            lv_addressNames_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddresses704); 

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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:361:2: (otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:361:4: otherlv_2= ',' otherlv_3= '@' ( (lv_addressNames_4_0= RULE_ID ) )
            	    {
            	    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleNamedAddresses722); 

            	        	newLeafNode(otherlv_2, grammarAccess.getNamedAddressesAccess().getCommaKeyword_2_0());
            	        
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleNamedAddresses734); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNamedAddressesAccess().getCommercialAtKeyword_2_1());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:369:1: ( (lv_addressNames_4_0= RULE_ID ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:370:1: (lv_addressNames_4_0= RULE_ID )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:370:1: (lv_addressNames_4_0= RULE_ID )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:371:3: lv_addressNames_4_0= RULE_ID
            	    {
            	    lv_addressNames_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddresses751); 

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
            	    break loop8;
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:395:1: entryRuleAddressTuple returns [EObject current=null] : iv_ruleAddressTuple= ruleAddressTuple EOF ;
    public final EObject entryRuleAddressTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressTuple = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:396:2: (iv_ruleAddressTuple= ruleAddressTuple EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:397:2: iv_ruleAddressTuple= ruleAddressTuple EOF
            {
             newCompositeNode(grammarAccess.getAddressTupleRule()); 
            pushFollow(FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple794);
            iv_ruleAddressTuple=ruleAddressTuple();

            state._fsp--;

             current =iv_ruleAddressTuple; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressTuple804); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:404:1: ruleAddressTuple returns [EObject current=null] : (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:407:28: ( (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:408:1: (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:408:1: (otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:408:3: otherlv_0= '@' otherlv_1= '(' ( (lv_elements_2_0= RULE_ID ) ) (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAddressTuple841); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressTupleAccess().getCommercialAtKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleAddressTuple853); 

                	newLeafNode(otherlv_1, grammarAccess.getAddressTupleAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:416:1: ( (lv_elements_2_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:417:1: (lv_elements_2_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:417:1: (lv_elements_2_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:418:3: lv_elements_2_0= RULE_ID
            {
            lv_elements_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressTuple870); 

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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:434:2: (otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:434:4: otherlv_3= ',' ( (lv_elements_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleAddressTuple888); 

            	        	newLeafNode(otherlv_3, grammarAccess.getAddressTupleAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:438:1: ( (lv_elements_4_0= RULE_ID ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:439:1: (lv_elements_4_0= RULE_ID )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:439:1: (lv_elements_4_0= RULE_ID )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:440:3: lv_elements_4_0= RULE_ID
            	    {
            	    lv_elements_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressTuple905); 

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
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleAddressTuple924); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:468:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:469:2: (iv_ruleMember= ruleMember EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:470:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_ruleMember_in_entryRuleMember960);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMember970); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:477:1: ruleMember returns [EObject current=null] : (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_LinkBinding_0 = null;

        EObject this_Expansion_1 = null;

        EObject this_Instantiation_2 = null;

        EObject this_Grouping_3 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:480:28: ( (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:481:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:481:1: (this_LinkBinding_0= ruleLinkBinding | this_Expansion_1= ruleExpansion | this_Instantiation_2= ruleInstantiation | this_Grouping_3= ruleGrouping )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==18) ) {
                    alt10=2;
                }
                else if ( (LA10_2==24) ) {
                    alt10=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==RULE_ID) ) {
                    int LA10_6 = input.LA(3);

                    if ( (LA10_6==18) ) {
                        int LA10_7 = input.LA(4);

                        if ( ((LA10_7>=28 && LA10_7<=29)) ) {
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
                    else if ( (LA10_6==24) ) {
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:482:5: this_LinkBinding_0= ruleLinkBinding
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getLinkBindingParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleLinkBinding_in_ruleMember1017);
                    this_LinkBinding_0=ruleLinkBinding();

                    state._fsp--;

                     
                            current = this_LinkBinding_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:492:5: this_Expansion_1= ruleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleExpansion_in_ruleMember1044);
                    this_Expansion_1=ruleExpansion();

                    state._fsp--;

                     
                            current = this_Expansion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:502:5: this_Instantiation_2= ruleInstantiation
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getInstantiationParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleMember1071);
                    this_Instantiation_2=ruleInstantiation();

                    state._fsp--;

                     
                            current = this_Instantiation_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:512:5: this_Grouping_3= ruleGrouping
                    {
                     
                            newCompositeNode(grammarAccess.getMemberAccess().getGroupingParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGrouping_in_ruleMember1098);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:528:1: entryRuleLinkBinding returns [EObject current=null] : iv_ruleLinkBinding= ruleLinkBinding EOF ;
    public final EObject entryRuleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:529:2: (iv_ruleLinkBinding= ruleLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:530:2: iv_ruleLinkBinding= ruleLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getLinkBindingRule()); 
            pushFollow(FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding1133);
            iv_ruleLinkBinding=ruleLinkBinding();

            state._fsp--;

             current =iv_ruleLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkBinding1143); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:537:1: ruleLinkBinding returns [EObject current=null] : this_TosNetLinkBinding_0= ruleTosNetLinkBinding ;
    public final EObject ruleLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject this_TosNetLinkBinding_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:540:28: (this_TosNetLinkBinding_0= ruleTosNetLinkBinding )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:542:5: this_TosNetLinkBinding_0= ruleTosNetLinkBinding
            {
             
                    newCompositeNode(grammarAccess.getLinkBindingAccess().getTosNetLinkBindingParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding1189);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:558:1: entryRuleTosNetLinkBinding returns [EObject current=null] : iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF ;
    public final EObject entryRuleTosNetLinkBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTosNetLinkBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:559:2: (iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:560:2: iv_ruleTosNetLinkBinding= ruleTosNetLinkBinding EOF
            {
             newCompositeNode(grammarAccess.getTosNetLinkBindingRule()); 
            pushFollow(FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding1223);
            iv_ruleTosNetLinkBinding=ruleTosNetLinkBinding();

            state._fsp--;

             current =iv_ruleTosNetLinkBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTosNetLinkBinding1233); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:567:1: ruleTosNetLinkBinding returns [EObject current=null] : (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:570:28: ( (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:571:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:571:1: (otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:571:3: otherlv_0= 'TOSNET' otherlv_1= '(' ( (lv_properties_2_0= ruleLinkProperty ) ) (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleTosNetLinkBinding1270); 

                	newLeafNode(otherlv_0, grammarAccess.getTosNetLinkBindingAccess().getTOSNETKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleTosNetLinkBinding1282); 

                	newLeafNode(otherlv_1, grammarAccess.getTosNetLinkBindingAccess().getLeftParenthesisKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:579:1: ( (lv_properties_2_0= ruleLinkProperty ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:1: (lv_properties_2_0= ruleLinkProperty )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:580:1: (lv_properties_2_0= ruleLinkProperty )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:581:3: lv_properties_2_0= ruleLinkProperty
            {
             
            	        newCompositeNode(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1303);
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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:597:2: (otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:597:4: otherlv_3= ',' ( (lv_properties_4_0= ruleLinkProperty ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleTosNetLinkBinding1316); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTosNetLinkBindingAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:601:1: ( (lv_properties_4_0= ruleLinkProperty ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:602:1: (lv_properties_4_0= ruleLinkProperty )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:602:1: (lv_properties_4_0= ruleLinkProperty )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:603:3: lv_properties_4_0= ruleLinkProperty
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTosNetLinkBindingAccess().getPropertiesLinkPropertyParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1337);
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
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleTosNetLinkBinding1351); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:631:1: entryRuleLinkProperty returns [EObject current=null] : iv_ruleLinkProperty= ruleLinkProperty EOF ;
    public final EObject entryRuleLinkProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:632:2: (iv_ruleLinkProperty= ruleLinkProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:633:2: iv_ruleLinkProperty= ruleLinkProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkPropertyRule()); 
            pushFollow(FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1387);
            iv_ruleLinkProperty=ruleLinkProperty();

            state._fsp--;

             current =iv_ruleLinkProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkProperty1397); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:640:1: ruleLinkProperty returns [EObject current=null] : ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:643:28: ( ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:644:1: ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:644:1: ( (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) ) | (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) ) | (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt12=1;
                }
                break;
            case 25:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:644:2: (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:644:2: (otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:644:4: otherlv_0= 'CTRL' otherlv_1= '=' ( (lv_ctrlName_2_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleLinkProperty1435); 

                        	newLeafNode(otherlv_0, grammarAccess.getLinkPropertyAccess().getCTRLKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1447); 

                        	newLeafNode(otherlv_1, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_0_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:652:1: ( (lv_ctrlName_2_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:653:1: (lv_ctrlName_2_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:653:1: (lv_ctrlName_2_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:654:3: lv_ctrlName_2_0= RULE_ID
                    {
                    lv_ctrlName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1464); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:671:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:671:6: (otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:671:8: otherlv_3= 'BASE' otherlv_4= '=' ( (lv_baseValue_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleLinkProperty1489); 

                        	newLeafNode(otherlv_3, grammarAccess.getLinkPropertyAccess().getBASEKeyword_1_0());
                        
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1501); 

                        	newLeafNode(otherlv_4, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:679:1: ( (lv_baseValue_5_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:680:1: (lv_baseValue_5_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:680:1: (lv_baseValue_5_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:681:3: lv_baseValue_5_0= RULE_INT
                    {
                    lv_baseValue_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLinkProperty1518); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:698:6: (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:698:6: (otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:698:8: otherlv_6= 'UART' otherlv_7= '=' ( (lv_uartName_8_0= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleLinkProperty1543); 

                        	newLeafNode(otherlv_6, grammarAccess.getLinkPropertyAccess().getUARTKeyword_2_0());
                        
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleLinkProperty1555); 

                        	newLeafNode(otherlv_7, grammarAccess.getLinkPropertyAccess().getEqualsSignKeyword_2_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:706:1: ( (lv_uartName_8_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:707:1: (lv_uartName_8_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:707:1: (lv_uartName_8_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:708:3: lv_uartName_8_0= RULE_ID
                    {
                    lv_uartName_8_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkProperty1572); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:732:1: entryRuleExpansion returns [EObject current=null] : iv_ruleExpansion= ruleExpansion EOF ;
    public final EObject entryRuleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:733:2: (iv_ruleExpansion= ruleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:734:2: iv_ruleExpansion= ruleExpansion EOF
            {
             newCompositeNode(grammarAccess.getExpansionRule()); 
            pushFollow(FOLLOW_ruleExpansion_in_entryRuleExpansion1614);
            iv_ruleExpansion=ruleExpansion();

            state._fsp--;

             current =iv_ruleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpansion1624); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:741:1: ruleExpansion returns [EObject current=null] : (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion ) ;
    public final EObject ruleExpansion() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleExpansion_0 = null;

        EObject this_AddressExpansion_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:744:28: ( (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:745:1: (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:745:1: (this_SimpleExpansion_0= ruleSimpleExpansion | this_AddressExpansion_1= ruleAddressExpansion )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==21) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:746:5: this_SimpleExpansion_0= ruleSimpleExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionAccess().getSimpleExpansionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSimpleExpansion_in_ruleExpansion1671);
                    this_SimpleExpansion_0=ruleSimpleExpansion();

                    state._fsp--;

                     
                            current = this_SimpleExpansion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:756:5: this_AddressExpansion_1= ruleAddressExpansion
                    {
                     
                            newCompositeNode(grammarAccess.getExpansionAccess().getAddressExpansionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressExpansion_in_ruleExpansion1698);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:772:1: entryRuleSimpleExpansion returns [EObject current=null] : iv_ruleSimpleExpansion= ruleSimpleExpansion EOF ;
    public final EObject entryRuleSimpleExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:773:2: (iv_ruleSimpleExpansion= ruleSimpleExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:774:2: iv_ruleSimpleExpansion= ruleSimpleExpansion EOF
            {
             newCompositeNode(grammarAccess.getSimpleExpansionRule()); 
            pushFollow(FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion1733);
            iv_ruleSimpleExpansion=ruleSimpleExpansion();

            state._fsp--;

             current =iv_ruleSimpleExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSimpleExpansion1743); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:781:1: ruleSimpleExpansion returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:784:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:785:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:785:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )? )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:785:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )? otherlv_7= ')' ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:785:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:786:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:786:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:787:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansion1785); 

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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleSimpleExpansion1802); 

                	newLeafNode(otherlv_1, grammarAccess.getSimpleExpansionAccess().getColonKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:807:1: ( (otherlv_2= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:808:1: (otherlv_2= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:808:1: (otherlv_2= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:809:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getSimpleExpansionRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSimpleExpansion1822); 

            		newLeafNode(otherlv_2, grammarAccess.getSimpleExpansionAccess().getConstructorConstructorCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleSimpleExpansion1834); 

                	newLeafNode(otherlv_3, grammarAccess.getSimpleExpansionAccess().getLeftParenthesisKeyword_3());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:824:1: ( ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:824:2: ( (lv_arguments_4_0= ruleArgument ) ) (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:824:2: ( (lv_arguments_4_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:825:1: (lv_arguments_4_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:825:1: (lv_arguments_4_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:826:3: lv_arguments_4_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleSimpleExpansion1856);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:842:2: (otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==16) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:842:4: otherlv_5= ',' ( (lv_arguments_6_0= ruleArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleSimpleExpansion1869); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSimpleExpansionAccess().getCommaKeyword_4_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:846:1: ( (lv_arguments_6_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:847:1: (lv_arguments_6_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:847:1: (lv_arguments_6_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:848:3: lv_arguments_6_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getArgumentsArgumentParserRuleCall_4_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleSimpleExpansion1890);
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleSimpleExpansion1906); 

                	newLeafNode(otherlv_7, grammarAccess.getSimpleExpansionAccess().getRightParenthesisKeyword_5());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:868:1: ( ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:868:2: ( (lv_bindings_8_0= ruleAddressBinding ) ) (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:868:2: ( (lv_bindings_8_0= ruleAddressBinding ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:869:1: (lv_bindings_8_0= ruleAddressBinding )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:869:1: (lv_bindings_8_0= ruleAddressBinding )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:870:3: lv_bindings_8_0= ruleAddressBinding
                    {
                     
                    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1928);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:886:2: (otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==16) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:886:4: otherlv_9= ',' ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSimpleExpansion1941); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSimpleExpansionAccess().getCommaKeyword_6_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:890:1: ( (lv_bindings_10_0= ruleAddressBinding ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:891:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:891:1: (lv_bindings_10_0= ruleAddressBinding )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:892:3: lv_bindings_10_0= ruleAddressBinding
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSimpleExpansionAccess().getBindingsAddressBindingParserRuleCall_6_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1962);
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
                    	    break loop16;
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:916:1: entryRuleAddressExpansion returns [EObject current=null] : iv_ruleAddressExpansion= ruleAddressExpansion EOF ;
    public final EObject entryRuleAddressExpansion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressExpansion = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:917:2: (iv_ruleAddressExpansion= ruleAddressExpansion EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:918:2: iv_ruleAddressExpansion= ruleAddressExpansion EOF
            {
             newCompositeNode(grammarAccess.getAddressExpansionRule()); 
            pushFollow(FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion2002);
            iv_ruleAddressExpansion=ruleAddressExpansion();

            state._fsp--;

             current =iv_ruleAddressExpansion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressExpansion2012); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:925:1: ruleAddressExpansion returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:928:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:929:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:929:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:929:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '(' ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAddressExpansion2049); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressExpansionAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:933:1: ( (lv_name_1_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:934:1: (lv_name_1_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:934:1: (lv_name_1_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:935:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansion2066); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAddressExpansion2083); 

                	newLeafNode(otherlv_2, grammarAccess.getAddressExpansionAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:955:1: ( (otherlv_3= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:956:1: (otherlv_3= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:956:1: (otherlv_3= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:957:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressExpansionRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressExpansion2103); 

            		newLeafNode(otherlv_3, grammarAccess.getAddressExpansionAccess().getConstructorConstructorCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAddressExpansion2115); 

                	newLeafNode(otherlv_4, grammarAccess.getAddressExpansionAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:1: ( ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:2: ( (lv_arguments_5_0= ruleArgument ) ) (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:972:2: ( (lv_arguments_5_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:1: (lv_arguments_5_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:973:1: (lv_arguments_5_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:974:3: lv_arguments_5_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleAddressExpansion2137);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:990:2: (otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:990:4: otherlv_6= ',' ( (lv_arguments_7_0= ruleArgument ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleAddressExpansion2150); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAddressExpansionAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:994:1: ( (lv_arguments_7_0= ruleArgument ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:1: (lv_arguments_7_0= ruleArgument )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:995:1: (lv_arguments_7_0= ruleArgument )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:996:3: lv_arguments_7_0= ruleArgument
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAddressExpansionAccess().getArgumentsArgumentParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleArgument_in_ruleAddressExpansion2171);
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
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleAddressExpansion2187); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1024:1: entryRuleArgument returns [EObject current=null] : iv_ruleArgument= ruleArgument EOF ;
    public final EObject entryRuleArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgument = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1025:2: (iv_ruleArgument= ruleArgument EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1026:2: iv_ruleArgument= ruleArgument EOF
            {
             newCompositeNode(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument2223);
            iv_ruleArgument=ruleArgument();

            state._fsp--;

             current =iv_ruleArgument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument2233); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1033:1: ruleArgument returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleArgument() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token lv_lhs_1_0=null;
        Token otherlv_2=null;
        Token lv_text_4_0=null;
        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1036:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1037:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1037:1: ( ( (lv_simple_0_0= RULE_ID ) ) | ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) ) | ( (lv_text_4_0= RULE_STRING ) ) )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==EOF||(LA20_1>=16 && LA20_1<=17)) ) {
                    alt20=1;
                }
                else if ( (LA20_1==27) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1037:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1037:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1038:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1038:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1039:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2275); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1056:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1056:6: ( ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1056:7: ( (lv_lhs_1_0= RULE_ID ) ) otherlv_2= '+' ( (lv_rhs_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1056:7: ( (lv_lhs_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1057:1: (lv_lhs_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1057:1: (lv_lhs_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1058:3: lv_lhs_1_0= RULE_ID
                    {
                    lv_lhs_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgument2304); 

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

                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleArgument2321); 

                        	newLeafNode(otherlv_2, grammarAccess.getArgumentAccess().getPlusSignKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1078:1: ( (lv_rhs_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1079:1: (lv_rhs_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1079:1: (lv_rhs_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1080:3: lv_rhs_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getArgumentAccess().getRhsArgumentParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleArgument2342);
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1097:6: ( (lv_text_4_0= RULE_STRING ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1097:6: ( (lv_text_4_0= RULE_STRING ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1098:1: (lv_text_4_0= RULE_STRING )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1098:1: (lv_text_4_0= RULE_STRING )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1099:3: lv_text_4_0= RULE_STRING
                    {
                    lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleArgument2366); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1123:1: entryRuleAddressBinding returns [EObject current=null] : iv_ruleAddressBinding= ruleAddressBinding EOF ;
    public final EObject entryRuleAddressBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressBinding = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1124:2: (iv_ruleAddressBinding= ruleAddressBinding EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1125:2: iv_ruleAddressBinding= ruleAddressBinding EOF
            {
             newCompositeNode(grammarAccess.getAddressBindingRule()); 
            pushFollow(FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding2407);
            iv_ruleAddressBinding=ruleAddressBinding();

            state._fsp--;

             current =iv_ruleAddressBinding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressBinding2417); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1132:1: ruleAddressBinding returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1135:28: ( (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1136:1: (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1136:1: (otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1136:3: otherlv_0= '@' ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )? otherlv_3= '(' ( (lv_addresses_4_0= RULE_HEX_NUM ) ) (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleAddressBinding2454); 

                	newLeafNode(otherlv_0, grammarAccess.getAddressBindingAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1140:1: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1140:2: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '='
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1140:2: ( (lv_name_1_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1141:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1141:1: (lv_name_1_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1142:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAddressBinding2472); 

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

                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAddressBinding2489); 

                        	newLeafNode(otherlv_2, grammarAccess.getAddressBindingAccess().getEqualsSignKeyword_1_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleAddressBinding2503); 

                	newLeafNode(otherlv_3, grammarAccess.getAddressBindingAccess().getLeftParenthesisKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1166:1: ( (lv_addresses_4_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1167:1: (lv_addresses_4_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1167:1: (lv_addresses_4_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1168:3: lv_addresses_4_0= RULE_HEX_NUM
            {
            lv_addresses_4_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2520); 

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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1184:2: (otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1184:4: otherlv_5= ',' ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAddressBinding2538); 

            	        	newLeafNode(otherlv_5, grammarAccess.getAddressBindingAccess().getCommaKeyword_4_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1188:1: ( (lv_addresses_6_0= RULE_HEX_NUM ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1189:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1189:1: (lv_addresses_6_0= RULE_HEX_NUM )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1190:3: lv_addresses_6_0= RULE_HEX_NUM
            	    {
            	    lv_addresses_6_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2555); 

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
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleAddressBinding2574); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1218:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1219:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1220:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation2610);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation2620); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1227:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1230:28: ( (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1231:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1231:1: (otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')' )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1231:3: otherlv_0= '@' ( (lv_address_1_0= ruleAddressSpec ) ) otherlv_2= ':' ( (lv_kind_3_0= ruleKind ) ) otherlv_4= '(' ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleInstantiation2657); 

                	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getCommercialAtKeyword_0());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1235:1: ( (lv_address_1_0= ruleAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1236:1: (lv_address_1_0= ruleAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1236:1: (lv_address_1_0= ruleAddressSpec )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1237:3: lv_address_1_0= ruleAddressSpec
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getAddressAddressSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAddressSpec_in_ruleInstantiation2678);
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleInstantiation2690); 

                	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getColonKeyword_2());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1257:1: ( (lv_kind_3_0= ruleKind ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1258:1: (lv_kind_3_0= ruleKind )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1258:1: (lv_kind_3_0= ruleKind )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1259:3: lv_kind_3_0= ruleKind
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getKindKindParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleKind_in_ruleInstantiation2711);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInstantiation2723); 

                	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getLeftParenthesisKeyword_4());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1279:1: ( ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=30 && LA24_0<=32)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1279:2: ( (lv_properties_5_0= ruleInstantiationProperty ) ) (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1279:2: ( (lv_properties_5_0= ruleInstantiationProperty ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1280:1: (lv_properties_5_0= ruleInstantiationProperty )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1280:1: (lv_properties_5_0= ruleInstantiationProperty )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1281:3: lv_properties_5_0= ruleInstantiationProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2745);
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

                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1297:2: (otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1297:4: otherlv_6= ',' ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    {
                    	    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleInstantiation2758); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getCommaKeyword_5_1_0());
                    	        
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1301:1: ( (lv_properties_7_0= ruleInstantiationProperty ) )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1302:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    {
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1302:1: (lv_properties_7_0= ruleInstantiationProperty )
                    	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1303:3: lv_properties_7_0= ruleInstantiationProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getPropertiesInstantiationPropertyParserRuleCall_5_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2779);
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
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleInstantiation2795); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1331:1: entryRuleAddressSpec returns [EObject current=null] : iv_ruleAddressSpec= ruleAddressSpec EOF ;
    public final EObject entryRuleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1332:2: (iv_ruleAddressSpec= ruleAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1333:2: iv_ruleAddressSpec= ruleAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getAddressSpecRule()); 
            pushFollow(FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2831);
            iv_ruleAddressSpec=ruleAddressSpec();

            state._fsp--;

             current =iv_ruleAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressSpec2841); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1340:1: ruleAddressSpec returns [EObject current=null] : (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) ;
    public final EObject ruleAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject this_DirectAddressSpec_0 = null;

        EObject this_NamedAddressSpec_1 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1343:28: ( (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1344:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1344:1: (this_DirectAddressSpec_0= ruleDirectAddressSpec | this_NamedAddressSpec_1= ruleNamedAddressSpec )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EOF||LA25_1==18) ) {
                    alt25=2;
                }
                else if ( (LA25_1==24) ) {
                    alt25=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1345:5: this_DirectAddressSpec_0= ruleDirectAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getDirectAddressSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2888);
                    this_DirectAddressSpec_0=ruleDirectAddressSpec();

                    state._fsp--;

                     
                            current = this_DirectAddressSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1355:5: this_NamedAddressSpec_1= ruleNamedAddressSpec
                    {
                     
                            newCompositeNode(grammarAccess.getAddressSpecAccess().getNamedAddressSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2915);
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1371:1: entryRuleDirectAddressSpec returns [EObject current=null] : iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF ;
    public final EObject entryRuleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1372:2: (iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1373:2: iv_ruleDirectAddressSpec= ruleDirectAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getDirectAddressSpecRule()); 
            pushFollow(FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2950);
            iv_ruleDirectAddressSpec=ruleDirectAddressSpec();

            state._fsp--;

             current =iv_ruleDirectAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDirectAddressSpec2960); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1380:1: ruleDirectAddressSpec returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) ;
    public final EObject ruleDirectAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_address_2_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1383:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1384:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1384:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1384:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_address_2_0= RULE_HEX_NUM ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1384:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1385:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1385:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1386:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDirectAddressSpec3002); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDirectAddressSpec3019); 

                	newLeafNode(otherlv_1, grammarAccess.getDirectAddressSpecAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1406:1: ( (lv_address_2_0= RULE_HEX_NUM ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1407:1: (lv_address_2_0= RULE_HEX_NUM )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1407:1: (lv_address_2_0= RULE_HEX_NUM )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1408:3: lv_address_2_0= RULE_HEX_NUM
            {
            lv_address_2_0=(Token)match(input,RULE_HEX_NUM,FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec3036); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1432:1: entryRuleNamedAddressSpec returns [EObject current=null] : iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF ;
    public final EObject entryRuleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedAddressSpec = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1433:2: (iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1434:2: iv_ruleNamedAddressSpec= ruleNamedAddressSpec EOF
            {
             newCompositeNode(grammarAccess.getNamedAddressSpecRule()); 
            pushFollow(FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec3077);
            iv_ruleNamedAddressSpec=ruleNamedAddressSpec();

            state._fsp--;

             current =iv_ruleNamedAddressSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedAddressSpec3087); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1441:1: ruleNamedAddressSpec returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleNamedAddressSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1444:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1445:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1445:1: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1446:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1446:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1447:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleNamedAddressSpec3128); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1471:1: entryRuleKind returns [String current=null] : iv_ruleKind= ruleKind EOF ;
    public final String entryRuleKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKind = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1472:2: (iv_ruleKind= ruleKind EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1473:2: iv_ruleKind= ruleKind EOF
            {
             newCompositeNode(grammarAccess.getKindRule()); 
            pushFollow(FOLLOW_ruleKind_in_entryRuleKind3169);
            iv_ruleKind=ruleKind();

            state._fsp--;

             current =iv_ruleKind.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKind3180); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1480:1: ruleKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'READ' | kw= 'WRITE' ) ;
    public final AntlrDatatypeRuleToken ruleKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1483:28: ( (kw= 'READ' | kw= 'WRITE' ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1484:1: (kw= 'READ' | kw= 'WRITE' )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1484:1: (kw= 'READ' | kw= 'WRITE' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1485:2: kw= 'READ'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleKind3218); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getKindAccess().getREADKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1492:2: kw= 'WRITE'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleKind3237); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1505:1: entryRuleInstantiationProperty returns [EObject current=null] : iv_ruleInstantiationProperty= ruleInstantiationProperty EOF ;
    public final EObject entryRuleInstantiationProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiationProperty = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1506:2: (iv_ruleInstantiationProperty= ruleInstantiationProperty EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1507:2: iv_ruleInstantiationProperty= ruleInstantiationProperty EOF
            {
             newCompositeNode(grammarAccess.getInstantiationPropertyRule()); 
            pushFollow(FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty3277);
            iv_ruleInstantiationProperty=ruleInstantiationProperty();

            state._fsp--;

             current =iv_ruleInstantiationProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiationProperty3287); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1514:1: ruleInstantiationProperty returns [EObject current=null] : ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) ;
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
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1517:28: ( ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1518:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1518:1: ( ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) ) | ( () otherlv_5= 'CRC' ) | ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt27=1;
                }
                break;
            case 31:
                {
                alt27=2;
                }
                break;
            case 32:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1518:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1518:2: ( () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1518:3: () otherlv_1= 'ID' otherlv_2= '=' ( (lv_id_3_0= ruleArgument ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1518:3: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1519:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getIDPropertyAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleInstantiationProperty3334); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstantiationPropertyAccess().getIDKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleInstantiationProperty3346); 

                        	newLeafNode(otherlv_2, grammarAccess.getInstantiationPropertyAccess().getEqualsSignKeyword_0_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1532:1: ( (lv_id_3_0= ruleArgument ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1533:1: (lv_id_3_0= ruleArgument )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1533:1: (lv_id_3_0= ruleArgument )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1534:3: lv_id_3_0= ruleArgument
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationPropertyAccess().getIdArgumentParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArgument_in_ruleInstantiationProperty3367);
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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:6: ( () otherlv_5= 'CRC' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:6: ( () otherlv_5= 'CRC' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:7: () otherlv_5= 'CRC'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1551:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1552:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getCRCPropertyAction_1_0(),
                                current);
                        

                    }

                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleInstantiationProperty3396); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstantiationPropertyAccess().getCRCKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1562:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1562:6: ( () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1562:7: () otherlv_7= 'PUBLISH' otherlv_8= '(' ( (lv_mode_9_0= RULE_INT ) ) otherlv_10= ',' ( (lv_rate_11_0= RULE_INT ) ) otherlv_12= ')'
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1562:7: ()
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1563:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getInstantiationPropertyAccess().getPublishPropertyAction_2_0(),
                                current);
                        

                    }

                    otherlv_7=(Token)match(input,32,FOLLOW_32_in_ruleInstantiationProperty3425); 

                        	newLeafNode(otherlv_7, grammarAccess.getInstantiationPropertyAccess().getPUBLISHKeyword_2_1());
                        
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleInstantiationProperty3437); 

                        	newLeafNode(otherlv_8, grammarAccess.getInstantiationPropertyAccess().getLeftParenthesisKeyword_2_2());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1576:1: ( (lv_mode_9_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1577:1: (lv_mode_9_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1577:1: (lv_mode_9_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1578:3: lv_mode_9_0= RULE_INT
                    {
                    lv_mode_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3454); 

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

                    otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleInstantiationProperty3471); 

                        	newLeafNode(otherlv_10, grammarAccess.getInstantiationPropertyAccess().getCommaKeyword_2_4());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1598:1: ( (lv_rate_11_0= RULE_INT ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1599:1: (lv_rate_11_0= RULE_INT )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1599:1: (lv_rate_11_0= RULE_INT )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1600:3: lv_rate_11_0= RULE_INT
                    {
                    lv_rate_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInstantiationProperty3488); 

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

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleInstantiationProperty3505); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1628:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1629:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1630:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping3542);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping3552); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1637:1: ruleGrouping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;

        EObject lv_elements_4_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1640:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1641:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1641:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1641:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_elements_2_0= ruleGroupElement ) ) (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1641:2: ( (lv_name_0_0= RULE_ID ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1642:1: (lv_name_0_0= RULE_ID )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1642:1: (lv_name_0_0= RULE_ID )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1643:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrouping3594); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleGrouping3611); 

                	newLeafNode(otherlv_1, grammarAccess.getGroupingAccess().getEqualsSignKeyword_1());
                
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1663:1: ( (lv_elements_2_0= ruleGroupElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1664:1: (lv_elements_2_0= ruleGroupElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1664:1: (lv_elements_2_0= ruleGroupElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1665:3: lv_elements_2_0= ruleGroupElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3632);
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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1681:2: (otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1681:4: otherlv_3= ',' ( (lv_elements_4_0= ruleGroupElement ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleGrouping3645); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGroupingAccess().getCommaKeyword_3_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1685:1: ( (lv_elements_4_0= ruleGroupElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1686:1: (lv_elements_4_0= ruleGroupElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1686:1: (lv_elements_4_0= ruleGroupElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1687:3: lv_elements_4_0= ruleGroupElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getElementsGroupElementParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroupElement_in_ruleGrouping3666);
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
            	    break loop28;
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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1711:1: entryRuleGroupElement returns [EObject current=null] : iv_ruleGroupElement= ruleGroupElement EOF ;
    public final EObject entryRuleGroupElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1712:2: (iv_ruleGroupElement= ruleGroupElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1713:2: iv_ruleGroupElement= ruleGroupElement EOF
            {
             newCompositeNode(grammarAccess.getGroupElementRule()); 
            pushFollow(FOLLOW_ruleGroupElement_in_entryRuleGroupElement3704);
            iv_ruleGroupElement=ruleGroupElement();

            state._fsp--;

             current =iv_ruleGroupElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroupElement3714); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1720:1: ruleGroupElement returns [EObject current=null] : ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) ;
    public final EObject ruleGroupElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_path_0_0 = null;

        EObject lv_path_2_0 = null;


         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1723:28: ( ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1724:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1724:1: ( ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )* )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1724:2: ( (lv_path_0_0= rulePathElement ) ) (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1724:2: ( (lv_path_0_0= rulePathElement ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1725:1: (lv_path_0_0= rulePathElement )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1725:1: (lv_path_0_0= rulePathElement )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1726:3: lv_path_0_0= rulePathElement
            {
             
            	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3760);
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

            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1742:2: (otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1742:4: otherlv_1= '.' ( (lv_path_2_0= rulePathElement ) )
            	    {
            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleGroupElement3773); 

            	        	newLeafNode(otherlv_1, grammarAccess.getGroupElementAccess().getFullStopKeyword_1_0());
            	        
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1746:1: ( (lv_path_2_0= rulePathElement ) )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1747:1: (lv_path_2_0= rulePathElement )
            	    {
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1747:1: (lv_path_2_0= rulePathElement )
            	    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1748:3: lv_path_2_0= rulePathElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupElementAccess().getPathPathElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePathElement_in_ruleGroupElement3794);
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
    // $ANTLR end "ruleGroupElement"


    // $ANTLR start "entryRulePathElement"
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1772:1: entryRulePathElement returns [EObject current=null] : iv_rulePathElement= rulePathElement EOF ;
    public final EObject entryRulePathElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePathElement = null;


        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1773:2: (iv_rulePathElement= rulePathElement EOF )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1774:2: iv_rulePathElement= rulePathElement EOF
            {
             newCompositeNode(grammarAccess.getPathElementRule()); 
            pushFollow(FOLLOW_rulePathElement_in_entryRulePathElement3832);
            iv_rulePathElement=rulePathElement();

            state._fsp--;

             current =iv_rulePathElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePathElement3842); 

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
    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1781:1: rulePathElement returns [EObject current=null] : ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) ;
    public final EObject rulePathElement() throws RecognitionException {
        EObject current = null;

        Token lv_simple_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1784:28: ( ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) ) )
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1785:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            {
            // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1785:1: ( ( (lv_simple_0_0= RULE_ID ) ) | (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID) ) {
                alt30=1;
            }
            else if ( (LA30_0==34) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1785:2: ( (lv_simple_0_0= RULE_ID ) )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1785:2: ( (lv_simple_0_0= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1786:1: (lv_simple_0_0= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1786:1: (lv_simple_0_0= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1787:3: lv_simple_0_0= RULE_ID
                    {
                    lv_simple_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3884); 

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
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1804:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1804:6: (otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')' )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1804:8: otherlv_1= 'ALL' otherlv_2= '(' ( (otherlv_3= RULE_ID ) ) otherlv_4= ')'
                    {
                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_rulePathElement3908); 

                        	newLeafNode(otherlv_1, grammarAccess.getPathElementAccess().getALLKeyword_1_0());
                        
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_rulePathElement3920); 

                        	newLeafNode(otherlv_2, grammarAccess.getPathElementAccess().getLeftParenthesisKeyword_1_1());
                        
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1812:1: ( (otherlv_3= RULE_ID ) )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1813:1: (otherlv_3= RULE_ID )
                    {
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1813:1: (otherlv_3= RULE_ID )
                    // ../unityLinkSoftwareInterfaceGenerator/src-gen/dk/sdu/mmmi/embedix/parser/antlr/internal/InternalULSWIG.g:1814:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPathElementRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePathElement3940); 

                    		newLeafNode(otherlv_3, grammarAccess.getPathElementAccess().getTypeConstructorCrossReference_1_2_0()); 
                    	

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_rulePathElement3952); 

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
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkSpec139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLinkSpec156 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleConstructor_in_ruleLinkSpec177 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleConstructor_in_entryRuleConstructor214 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructor224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleConstructor267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor298 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleConstructor315 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor333 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleConstructor351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstructor368 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleConstructor389 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleConstructor402 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_ruleConstructor423 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstructor437 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleMember_in_ruleConstructor459 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleConstructor471 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_20_in_ruleConstructor485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstructorAddressParameters_in_entryRuleConstructorAddressParameters521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstructorAddressParameters531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_ruleConstructorAddressParameters578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_ruleConstructorAddressParameters605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddresses_in_entryRuleNamedAddresses640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddresses650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNamedAddresses687 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddresses704 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleNamedAddresses722 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNamedAddresses734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddresses751 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAddressTuple_in_entryRuleAddressTuple794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressTuple804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddressTuple841 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddressTuple853 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressTuple870 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAddressTuple888 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressTuple905 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAddressTuple924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMember_in_entryRuleMember960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMember970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_ruleMember1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_ruleMember1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleMember1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleMember1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkBinding_in_entryRuleLinkBinding1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkBinding1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_ruleLinkBinding1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTosNetLinkBinding_in_entryRuleTosNetLinkBinding1223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTosNetLinkBinding1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTosNetLinkBinding1270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTosNetLinkBinding1282 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1303 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleTosNetLinkBinding1316 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_ruleTosNetLinkBinding1337 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleTosNetLinkBinding1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkProperty_in_entryRuleLinkProperty1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkProperty1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleLinkProperty1435 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1447 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleLinkProperty1489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLinkProperty1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleLinkProperty1543 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleLinkProperty1555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkProperty1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpansion_in_entryRuleExpansion1614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpansion1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_ruleExpansion1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_ruleExpansion1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleExpansion_in_entryRuleSimpleExpansion1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSimpleExpansion1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansion1785 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSimpleExpansion1802 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSimpleExpansion1822 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSimpleExpansion1834 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleSimpleExpansion1856 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleSimpleExpansion1869 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleSimpleExpansion1890 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleSimpleExpansion1906 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1928 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleSimpleExpansion1941 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_ruleSimpleExpansion1962 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleAddressExpansion_in_entryRuleAddressExpansion2002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressExpansion2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddressExpansion2049 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansion2066 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAddressExpansion2083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressExpansion2103 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddressExpansion2115 = new BitSet(new long[]{0x0000000000020050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAddressExpansion2137 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAddressExpansion2150 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleAddressExpansion2171 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAddressExpansion2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgument2304 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleArgument2321 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleArgument2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleArgument2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressBinding_in_entryRuleAddressBinding2407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressBinding2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAddressBinding2454 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAddressBinding2472 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAddressBinding2489 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAddressBinding2503 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2520 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleAddressBinding2538 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleAddressBinding2555 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleAddressBinding2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleInstantiation2657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_ruleInstantiation2678 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleInstantiation2690 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_ruleKind_in_ruleInstantiation2711 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiation2723 = new BitSet(new long[]{0x00000001C0020000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2745 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiation2758 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_ruleInstantiation2779 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_17_in_ruleInstantiation2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressSpec_in_entryRuleAddressSpec2831 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressSpec2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_ruleAddressSpec2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_ruleAddressSpec2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDirectAddressSpec_in_entryRuleDirectAddressSpec2950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDirectAddressSpec2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDirectAddressSpec3002 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDirectAddressSpec3019 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_HEX_NUM_in_ruleDirectAddressSpec3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedAddressSpec_in_entryRuleNamedAddressSpec3077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedAddressSpec3087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleNamedAddressSpec3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKind_in_entryRuleKind3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKind3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleKind3218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleKind3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationProperty_in_entryRuleInstantiationProperty3277 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationProperty3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInstantiationProperty3334 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInstantiationProperty3346 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_ruleArgument_in_ruleInstantiationProperty3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInstantiationProperty3396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInstantiationProperty3425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInstantiationProperty3437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3454 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleInstantiationProperty3471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInstantiationProperty3488 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleInstantiationProperty3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping3542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrouping3594 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGrouping3611 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3632 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleGrouping3645 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_ruleGroupElement_in_ruleGrouping3666 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleGroupElement_in_entryRuleGroupElement3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroupElement3714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3760 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleGroupElement3773 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_rulePathElement_in_ruleGroupElement3794 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rulePathElement_in_entryRulePathElement3832 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePathElement3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePathElement3908 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePathElement3920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePathElement3940 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePathElement3952 = new BitSet(new long[]{0x0000000000000002L});

}