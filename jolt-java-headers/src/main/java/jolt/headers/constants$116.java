// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$116 {

    static final FunctionDescriptor JPC_PointConstraintSettings_SetPoint2$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_PointConstraintSettings_SetPoint2$MH = RuntimeHelper.downcallHandle(
        "JPC_PointConstraintSettings_SetPoint2",
        constants$116.JPC_PointConstraintSettings_SetPoint2$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle JPC_HingeConstraintSettings_Create$MH = RuntimeHelper.downcallHandleVariadic(
        "JPC_HingeConstraintSettings_Create",
        constants$116.JPC_HingeConstraintSettings_Create$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_GetSpace$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_GetSpace$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_GetSpace",
        constants$116.JPC_HingeConstraintSettings_GetSpace$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_SetSpace$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_SetSpace$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_SetSpace",
        constants$116.JPC_HingeConstraintSettings_SetSpace$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_GetPoint1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_GetPoint1$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_GetPoint1",
        constants$116.JPC_HingeConstraintSettings_GetPoint1$FUNC
    );
    static final FunctionDescriptor JPC_HingeConstraintSettings_SetPoint1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_HingeConstraintSettings_SetPoint1$MH = RuntimeHelper.downcallHandle(
        "JPC_HingeConstraintSettings_SetPoint1",
        constants$116.JPC_HingeConstraintSettings_SetPoint1$FUNC
    );
}


