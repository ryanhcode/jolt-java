// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$95 {

    static final FunctionDescriptor JPC_SliderConstraint_GetMaxFrictionForce$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraint_GetMaxFrictionForce$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraint_GetMaxFrictionForce",
        constants$95.JPC_SliderConstraint_GetMaxFrictionForce$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraint_SetMaxFrictionForce$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraint_SetMaxFrictionForce$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraint_SetMaxFrictionForce",
        constants$95.JPC_SliderConstraint_SetMaxFrictionForce$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraint_GetMotorSettings$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraint_GetMotorSettings$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraint_GetMotorSettings",
        constants$95.JPC_SliderConstraint_GetMotorSettings$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraint_SetMotorState$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_CHAR$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraint_SetMotorState$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraint_SetMotorState",
        constants$95.JPC_SliderConstraint_SetMotorState$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraint_GetMotorState$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraint_GetMotorState$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraint_GetMotorState",
        constants$95.JPC_SliderConstraint_GetMotorState$FUNC
    );
    static final FunctionDescriptor JPC_SliderConstraint_SetTargetVelocity$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_SliderConstraint_SetTargetVelocity$MH = RuntimeHelper.downcallHandle(
        "JPC_SliderConstraint_SetTargetVelocity",
        constants$95.JPC_SliderConstraint_SetTargetVelocity$FUNC
    );
}


