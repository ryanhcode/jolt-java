// Generated by jextract

package jolt.headers_d;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$63 {

    static final FunctionDescriptor JPC_RotatedTranslatedShape_GetPosition$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_RotatedTranslatedShape_GetPosition$MH = RuntimeHelper.downcallHandle(
        "JPC_RotatedTranslatedShape_GetPosition",
        constants$63.JPC_RotatedTranslatedShape_GetPosition$FUNC
    );
    static final FunctionDescriptor JPC_RotatedTranslatedShape_GetRotation$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_RotatedTranslatedShape_GetRotation$MH = RuntimeHelper.downcallHandle(
        "JPC_RotatedTranslatedShape_GetRotation",
        constants$63.JPC_RotatedTranslatedShape_GetRotation$FUNC
    );
    static final FunctionDescriptor JPC_OffsetCenterOfMassShape_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_OffsetCenterOfMassShape_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_OffsetCenterOfMassShape_Create",
        constants$63.JPC_OffsetCenterOfMassShape_Create$FUNC
    );
    static final FunctionDescriptor JPC_OffsetCenterOfMassShape_GetOffset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_OffsetCenterOfMassShape_GetOffset$MH = RuntimeHelper.downcallHandle(
        "JPC_OffsetCenterOfMassShape_GetOffset",
        constants$63.JPC_OffsetCenterOfMassShape_GetOffset$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_CreateBody$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_CreateBody$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_CreateBody",
        constants$63.JPC_BodyInterface_CreateBody$FUNC
    );
    static final FunctionDescriptor JPC_BodyInterface_CreateBodyWithID$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_BodyInterface_CreateBodyWithID$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyInterface_CreateBodyWithID",
        constants$63.JPC_BodyInterface_CreateBodyWithID$FUNC
    );
}


